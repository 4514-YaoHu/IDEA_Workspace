package com.wyc.java02;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * @ClassName TreeMapTest
 * @Author 王韫琛
 * @Date 2020/12/15 21:00
 * @Version 1.0
 */
public class TreeMapTest {
    //向TreeMap中添加key-value,要求必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序、定制排序
    @Test
    public void test01() throws IOException {
        //Properties:常用来处理配置文件。key和value都是String类型
        FileInputStream file = null;
        try {
            Properties pro = new Properties();
            file = new FileInputStream("jdbc.properties");
            pro.load(file);//加载对应的文件
            String name = pro.getProperty("name");
            String password = pro.getProperty("password");
            System.out.println(name + "," + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null)
            {
                file.close();
            }
        }
    }
    @Test
        public void test02(){
            List list = new ArrayList();
            list.add(123);
            list.add(12);
            list.add(23);
            list.add(13);
            list.add(3);
            list.add(823);
            System.out.println(list);//[123, 12, 23, 13, 3, 823]
            Collections.reverse(list);
            System.out.println(list);//[823, 3, 13, 23, 12, 123]
            //随机处理
            Collections.shuffle(list);
            System.out.println(list);//[823, 123, 23, 3, 13, 12]
            Collections.sort(list);
            System.out.println(list);//[3, 12, 13, 23, 123, 823]
            Collections.swap(list,1,3);
            System.out.println(list);//[3, 23, 13, 12, 123, 823]
            int frequency = Collections.frequency(list,823);
            System.out.println(frequency);
            List desc = Arrays.asList(new Object[list.size()]);
            Collections.copy(desc,list);
            System.out.println(desc);//[3, 23, 13, 12, 123, 823]
            //返回的list1即为线程安全的list
            List list1 = Collections.synchronizedList(list);
        }
}
