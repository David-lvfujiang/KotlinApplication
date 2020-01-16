package com.example.kotlinapplication.module;

/**
 * @Author: david.lvfujiang
 * @Date: 2019/11/26
 * @Describe:
 */
public class UserName {
    String name;
    int age;

    public UserName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "UserName{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
