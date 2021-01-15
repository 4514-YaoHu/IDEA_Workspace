package com.wyc.mryohko;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王韫琛
 * @create 2020-10-16 14:35
 */
public class ContentServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContent对象
        ServletContext context = getServletContext();
        context.setAttribute("key1","value1");
        System.out.println("从Contex1中获取数据key1的值" + context.getAttribute("key1"));
        System.out.println("从Contex1中获取数据key1的值" + context.getAttribute("key1"));
        System.out.println("从Contex1中获取数据key1的值" + context.getAttribute("key1"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
