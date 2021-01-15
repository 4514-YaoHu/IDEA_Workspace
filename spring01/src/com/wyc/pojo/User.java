package com.wyc.pojo;

/**
 * @ClassName User
 * @Author 王韫琛
 * @Date 2021/1/12 4:31
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String userName;//姓名
    private String context;//内容

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public User() {
    }

    public User(Integer id, String userName, String context) {
        this.id = id;
        this.userName = userName;
        this.context = context;
    }
    public void say(){
        System.out.println(userName + "说：" + context);
    }
}
