package com.wyc.java01;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName IteratorTest
 * @Author 王韫琛
 * @Date 2020/12/13 11:15
 * @Version 1.0
 */
public class IteratorTest {
    @Test
    public void test01() {
        //集合的遍历操作：迭代器（Iterator接口）
        //内部方法：hasNext()、Nest()
        Collection col = new ArrayList();
        col.add("王韫琛");
        col.add("白笑话");
        col.add("来比都");
        col.add(new Person(88, "不老天后"));
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test02() {
        Collection coll = new ArrayList();
        coll.add("王允很");
        coll.add("王很");
        coll.add("王韫琛");
        coll.add(new Person(88, "王侯"));
        Iterator iterator = coll.iterator();
        System.out.println("移出前:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("移除后：");
        iterator = coll.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if ("王韫琛".equals(o)) {
                iterator.remove();
            }
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test03() {
        Collection coll = new ArrayList();
        coll.add("王韫琛");
        coll.add(123);
        coll.add(new Person(99, "不死妊线"));
        coll.add("333");
        //for(集合元素类型 局部变量 ：集合对象)，内部仍然使用了迭代器
        for (Object o : coll) {
            System.out.println(o);
        }
    }

    @Test
    public void test04() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("王韫琛");
        arrayList.add("邓紫棋");
        arrayList.add("刘爱珍");
        arrayList.add(new Person(22, "小红"));
        System.out.println(arrayList);//[王韫琛, 邓紫棋, 刘爱珍, Person{age=22, name='小红'}]
        //void add(int index,Object ele):在index位置插入ele元素
        arrayList.add(1,"飞虎队");
        System.out.println(arrayList);//[王韫琛, 飞虎队, 邓紫棋, 刘爱珍, Person{age=22, name='小红'}]
        //boolean addAll(int index,Collection eles):从index位置开始将eles中的所有元素添加进来
        List lists = Arrays.asList("白小白",new Person(88,"不老男神"));
        arrayList.addAll(lists);
        System.out.println(arrayList.size());//7
        //Object get(int index):获取指定index位置上的元素
        System.out.println(arrayList.get(0));//王韫琛
        //int indexOf(Object obj):返回obj在集合中首次出现的位置，不存在返回-1
        System.out.println(arrayList.indexOf("王韫琛"));//0
        //int lastIndexOf(Object obj):返回obj在当前集合末次出现的位置，不存在返回-1
        System.out.println(arrayList.lastIndexOf("小红"));//-1
        //Object remove(int index):移除指定index位置的元素，并返回此元素
        arrayList.remove(0);
        System.out.println(arrayList);
        //[飞虎队, 邓紫棋, 刘爱珍, Person{age=22, name='小红'}, 白小白, Person{age=88, name='不老男神'}]
        //Object set(int index,Object ele):设置指定index位置的元素为ele
        arrayList.set(0,"王韫琛");
        System.out.println(arrayList);
        //[王韫琛, 邓紫棋, 刘爱珍, Person{age=22, name='小红'}, 白小白, Person{age=88, name='不老男神'}]
        //List subList(int fromIndex,int toIndex):返回从fromIndex到toIndex位置(左闭右开)的子集合
        List list = arrayList.subList(0, 3);
        System.out.println(list);//[王韫琛, 邓紫棋, 刘爱珍]
    }
    @Test
    public void test05(){
        ArrayList lists = new ArrayList();
        lists.add(123);
        lists.add(456);
        lists.add(789);
        lists.add("王韫琛");
        System.out.println("迭代器");
        //迭代器
        Iterator iterator = lists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //增强for循环
        System.out.println("增强for循环");
        for(Object list: lists){
            System.out.println(list);
        }
        //for循环
        System.out.println("for循环");
        for(int i=0;i<lists.size();i++){
            System.out.println(lists.get(i));
        }
    }
    @Test
    public void test06(){
        /**
         * Set:存储无序、不可重复的数据
         * 以HashSet为例说明：
         * 1.无序性：不等于随机性，存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值确定
         * 2.不可重复性：保证添加的元素按照equals()判断时，不能返回true，即相同的元素不能添加进来
         * 要求：向Set中添加的数据，其所在的类一定要重写hashCode()和equals()，即相等的对象必须具有相等的散列码
         * HashSet具有一下特点：
         *  不能保证元素的排列顺序
         *  HasSet不是线程安全的
         *  集合可以是null
         * HashSet集合判断两个元素相等的标准：两个对象通过hashCode()方法比较相等，并且两个对象的equals()方法返回值也相等
         */
        Set set = new HashSet();
        set.add(123);
        set.add("王韫琛");
        set.add(new Person(55,"王自健"));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test07(){
        /**
         * 1.向TreeSet中添加的数据，要求是相同的对象
         * 2.两种排序方式 自然排序和定制排序
         *  自然排序，比较两个对象是否相同的标准为：compareTo()返回0不在是equals()方法
         *  定制排序，比较两个对象是否相同标准为：compare()返回0，不在是equals()方法
         */
        TreeSet set = new TreeSet();
        set.add(123);
        set.add(456);
        set.add(789);
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test08(){
        TreeSet set = new TreeSet();
        set.add(new Person(88,"王韫琛"));
        set.add(new Person(55,"白孝标"));
        set.add(new Person(82,"啊浩"));
        set.add(new Person(86,"卜琛"));
        set.add(new Person(10,"韫琛"));
        set.add(new Person(80,"韫琛"));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test09(){
        /**
         * 定制排序
         */
        Comparator comparator = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person person = (Person)o1;
                    Person person1 = (Person)o2;
                    return Integer.compare(person.getAge(),person1.getAge());
                }else
                    throw new RuntimeException("类型不匹配");
            }

        };
        TreeSet set = new TreeSet(comparator);
        set.add(new Person(11,"王允很"));
        set.add(new Person(13,"王允"));
        set.add(new Person(31,"王很"));
        set.add(new Person(61,"允很"));
        set.add(new Person(51,"王琛"));
        set.add(new Person(21,"王琛很"));
        set.add(new Person(41,"王的很"));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
