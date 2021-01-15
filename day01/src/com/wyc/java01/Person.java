package com.wyc.java01;

import java.util.Objects;

/**
 * @ClassName Person
 * @Author 王韫琛
 * @Date 2020/12/13 9:41
 * @Version 1.0
 */
public class Person implements Comparable{
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(age, person.age) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
//按照姓名从小到大排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            Person person = (Person)o;
            int compare = this.name.compareTo(person.name);
            if (compare!=0){
                return compare;
            }else {
                return Integer.compare(this.age,person.age);
            }
        }else {
            throw new RuntimeException("输入类型不匹配");
        }
    }
}
