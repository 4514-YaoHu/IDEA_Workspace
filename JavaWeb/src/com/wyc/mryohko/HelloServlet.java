    package com.wyc.mryohko;

    import javax.servlet.*;
    import javax.servlet.http.HttpServletRequest;
    import java.io.IOException;

    /**
     * @author 王韫琛
     * @create 2020-10-15 16:03
     */
    public class HelloServlet implements Servlet {
        public HelloServlet() {
            System.out.println("servlet构造器");
        }

        @Override
        public void init(ServletConfig servletConfig) throws ServletException {
            System.out.println("servlet初始化");
            System.out.println("Servlet的别名" + servletConfig.getServletName());
            System.out.println("Servlet的参数username值" + servletConfig.getInitParameter("username"));
            System.out.println(servletConfig.getServletContext());
        }

        @Override
        public ServletConfig getServletConfig() {
            return null;
        }

        /**
         * service方法是专门用来处理和请求响应的
         * @param servletRequest
         * @param servletResponse
         * @throws ServletException
         * @throws IOException
         */
        @Override
        public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
            System.out.println("hello servlet 被访问了");
            HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
            String method = httpServletRequest.getMethod();
            if ("GET".equals(method)){
                System.out.println("get提交");
            }else {
                System.out.println("post提交");
            }
        }

        @Override
        public String getServletInfo() {
            return null;
        }

        @Override
        public void destroy() {
            System.out.println("destory销毁");
        }
    }
