package com.wyc.test;

import com.wyc.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring
 * @Author 王韫琛
 * @Date 2021/1/12 4:37
 * @Version 1.0
 */
public class TestSpring {
    public static void main(String[] args) {
        //读取spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取User实例
        User user = (User) ac.getBean("zhangsan");
        user.say();
    }
}
