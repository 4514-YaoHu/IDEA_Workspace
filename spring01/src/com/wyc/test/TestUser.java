package com.wyc.test;

import com.wyc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestUser
 * @Author 王韫琛
 * @Date 2021/1/12 13:46
 * @Version 1.0
 */
public class TestUser {
    @Test
    public void test01(){
        //1.读取spring配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.创建业务层对象
        UserService userService = (UserService) ac.getBean("userService");
        userService.addUser(null);
        userService.deleteUser(null);
    }
}
