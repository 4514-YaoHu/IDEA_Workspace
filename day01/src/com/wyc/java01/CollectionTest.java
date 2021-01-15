package com.wyc.java01;

import org.junit.Test;

import java.util.*;


/**
 * @ClassName Collection
 * @Author 王韫琛
 * @Date 2020/12/12 20:30
 * @Version 1.0
 */
public class CollectionTest {
    @Test
    public void test01(){
        Collection coll01 = new ArrayList();
        //add(Object):将元素e添加到集合coll中
        coll01.add("王运琛");
        coll01.add("秋香");
        coll01.add("夏旭");
        coll01.add(123);
        coll01.add(new Date());
        //size():获取添加元素的个数
        System.out.println(coll01.size());
        //addAll(Collection coll01):将coll01集合中的元素添加到当前集合中
        Collection coll02 = new ArrayList();
        coll02.add("吸星大法");
        coll02.add("玉女震惊");
        coll02.addAll(coll01);
        //clear():清空集合元素
        coll02.clear();
        System.out.println(coll02.size());
        //isEmpty():判断当前集合是否为空
        System.out.println(coll02.isEmpty());
        //5
        //0
        //true
    }
    /**
     * Collection接口中声明方法的测试
     * 向Collection接口的实现类的对象中添加数据obj时，需要obj所在类要重写equals()
     */
    @Test
    public void test02(){
        Collection coll = new ArrayList();
        //1.contains:判断当前集合中是否包含obj,我们在判断时会调用obj对象所在类的equals()
        coll.add("王运琛");
        coll.add("苍穹");
        coll.add("窑口");
        coll.add(new Date());
        coll.add(new String("王子的新衣"));
        coll.add(new Person(22,"贴莲花"));
        boolean co1 = coll.contains(123);
        boolean co2 = coll.contains(new String("王子的新衣"));
        boolean co3 = coll.contains(new Person(22, "贴莲花"));//调用的equals，因为没有重写所以是false
        System.out.println(co3);//false
        System.out.println(co1);//false
        System.out.println(co2);//true
        //2.containsAll(Collection coll1):判断形参col1中的所有元素是否都存在于当前集合中
        Collection coll2 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll2));

    }
    @Test
    public void test03(){
        Collection coll1 = new ArrayList();
        //3.remove(Object obj):从当前集合中一处元素，成功true,失败false
        coll1.add(1234);
        coll1.add(4848);
        coll1.add("王运琛");
        System.out.println(coll1.size());//3
        System.out.println(coll1);//[1234, 4848, 王运琛]
        coll1.remove(12345);
        System.out.println(coll1.size());//2
        System.out.println(coll1);//[4848, 王运琛]
        //4.removeAll(Object obj):从当前集合中移出obj中所有的元素
        Collection coll2 = Arrays.asList(132,456,1234);
        coll1.removeAll(coll2);
        System.out.println(coll1);//[4848, 王运琛]

    }
    @Test
    public void test04(){
        Collection coll01 = Arrays.asList(123,456,789,878,new Person(22,"王运琛"));
        //5.retainAll(Collection coll):交集：获取当前集合和coll集合的交集，并返回给当前集合
        Collection coll02 = Arrays.asList(123,456,789,new Person(22,"王运琛"));
        coll02.retainAll(coll01);
        System.out.println(coll02);//[123, 456, 789, Person{age=22, name='王运琛'}]
        //6.equals(Object obj):要想返回true，需要当前集合和形参集合的元素相同，顺序是不是相同要看右边
        Collection coll03 = Arrays.asList(123,456,789,878,new Person(22,"王运琛"));
        System.out.println(coll01.equals(coll03));//true
    }
    @Test
    public void test05(){
        Collection coll = Arrays.asList("王运琛","王韫琛");
        //7.hashCode():返回当前对象的hasCode
        System.out.println(coll.hashCode());//947151302
        //8.集合--->数组:toArray()
        Object[] objects = coll.toArray();
        for (int i = 0;i<objects.length;i++){
            System.out.println(objects[i]);
        }
        //拓展：数组--->集合
        List ints = Arrays.asList(new int[]{1, 2, 30});
        System.out.println(ints.size());//1
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 30});
        System.out.println(list.size());//3
        List<String> strings = Arrays.asList(new String[]{"AA", "BB"});
        System.out.println(strings);//[AA, BB]
        //9.iterator():返回Iterator接口的实例，用于遍历集合元素
    }
}
