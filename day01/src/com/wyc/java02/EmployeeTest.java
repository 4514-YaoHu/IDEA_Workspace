package com.wyc.java02;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @ClassName EmployeeTest
 * @Author 王韫琛
 * @Date 2020/12/14 18:25
 * @Version 1.0
 */
public class EmployeeTest {
    @Test
    public void test01() {
        TreeSet set = new TreeSet();
        Employee em01 = new Employee("刘德华", 55, new MyDate(1968, 5, 4));
        Employee em02 = new Employee("张学友", 45, new MyDate(1960, 5, 4));
        Employee em03 = new Employee("黎明", 51, new MyDate(1966, 5, 4));
        Employee em04 = new Employee("梁朝伟", 41, new MyDate(1961, 5, 4));
        set.add(em01);
        set.add(em02);
        set.add(em03);
        set.add(em04);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //自定义排序
    @Test
    public void test02() {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
//                    int minusYear = b1.getYear() - b2.getYear();
//                    if (minusYear != 0) {
//                        return minusYear;
//                    }
//                    int minusMonth = b1.getMonth() - b2.getMonth();
//                    if (minusMonth != 0) {
//                        return minusMonth;
//                    }
//                    int minusDay = b1.getDay() - b2.getDay();
//                    if (minusDay !=0){
//                        return minusDay;
//                    }
//                    return 0;
                    //方式二：在MyDate里面重写comparte
                    return b1.compareTo(b2);
                }
                throw new RuntimeException("输入类型不一致");
            }
        });
        Employee em01 = new Employee("刘德华", 55, new MyDate(1968, 5, 4));
        Employee em02 = new Employee("张学友", 45, new MyDate(1960, 5, 4));
        Employee em03 = new Employee("黎明", 51, new MyDate(1966, 5, 4));
        Employee em04 = new Employee("梁朝伟", 41, new MyDate(1961, 5, 4));
        set.add(em01);
        set.add(em02);
        set.add(em03);
        set.add(em04);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
