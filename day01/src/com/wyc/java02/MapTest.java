package com.wyc.java02;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName MapTest
 * @Author 王韫琛
 * @Date 2020/12/15 9:00
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test01(){
        Map map = new HashMap();
        map.put(null,null);
        map.put(null,123);
        System.out.println(map);
    }
    @Test
    public void test02(){
        //Object put(Object key,Object value):将指定的key-value添加到（或修改）当前map对象中
        //void putAll(Map m):将m中的所有key-value对存放到当前map中
        //Object remove(Object key):移除指定的key-value对，并返回value
        //void clear():清空当前map中的所有数据
        Map map = new HashMap();
        map.put("AA",1);
        map.put("BB",23);
        map.put("CC",123);
        //修改
        map.put("AA",3);
        System.out.println(map);//{AA=3, BB=23, CC=123}
        Map map1 = new HashMap();
        map1.put("DD",456);
        map1.put("EE",456);
        map.putAll(map1);
        System.out.println(map);//{AA=3, BB=23, CC=123, DD=456, EE=456}
        Object aa = map.remove("AA");
        System.out.println(map);//{BB=23, CC=123, DD=456, EE=456}
        map.clear();
        System.out.println(map.size());//0
        System.out.println(map);//{}
    }
    @Test
    public void test03() {
        Map map = new HashMap();
        map.put(1,"王宇晨");
        map.put(2,"王晨");
        map.put(3,"宇晨");
        map.put(4,"王宇");
        map.put(5,"王韫琛");
        //Object get(Object key):获取指定key对应的value
        System.out.println(map.get(2));
        //boolean  containsKey():是否包含指定的key
        boolean b = map.containsKey(1);//王晨
        //boolean  containsValue():是否包含指定的value
        boolean name = map.containsValue("王韫琛");
        System.out.println(b +","+name);//true,true
        System.out.println(map.isEmpty());//判断map是否为空：false
        //int size():返回map中key-value对的个数
        int size = map.size();
        System.out.println(size);//5
        //boolean equals(Object object):判断当前对象map和参数对象obj是否相等，类型要一样、内容要一样
    }
    @Test
    public void test04() {
        Map map = new HashMap();
        map.put(1,4214616);
        map.put(2,421461);
        map.put(3,421616);
        map.put(4,424616);
        map.put(5,414616);
        //遍历所有的key集：keySet()
        //Set keySet():返回所有key构成的Set集合
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历values
        //Collection values():返回所用value构成的Collection集合
        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        //遍历所偶的key-value
        //Set entrySet():返回所有key-value对象构成的Set集合
        Set set1 = map.entrySet();//放了很多个entry
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()){
            Object next = iterator2.next();
            //entry集合中的元素都是entry
            Map.Entry entry = (Map.Entry)next;
            System.out.println(entry.getKey() + "————>" + entry.getValue());
        }
        //方式二：
        Set keySet = map.keySet();
        Iterator iterator3 = keySet.iterator();
        while (iterator3.hasNext()){
            Object key = iterator3.next();
            Object value = map.get(key);
            System.out.println(key + "————>" + value);
        }
    }

}
