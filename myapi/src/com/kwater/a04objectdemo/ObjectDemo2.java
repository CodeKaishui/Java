package com.kwater.a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("zhangsan",23);
        System.out.println(stu1.equals(stu2));
    }
}
