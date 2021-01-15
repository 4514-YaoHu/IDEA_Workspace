package com.wyc.java02;

/**
 * @ClassName Employee
 * @Author 王韫琛
 * @Date 2020/12/14 18:11
 * @Version 1.0
 */
public class Employee implements Comparable{
    private String name;
    private Integer age;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
    public Employee() {
    }
    public Employee(String name, Integer age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee employee = (Employee)o;
            return this.name.compareTo(employee.name);
        }
        throw new RuntimeException("类型不一致");
    }
}
