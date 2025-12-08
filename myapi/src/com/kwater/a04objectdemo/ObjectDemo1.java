package com.kwater.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);

        Student stu1 = new Student("zhangsan",23);
        String str2 = stu1.toString();
        System.out.println(str2);
        System.out.println(stu1);
    }
}
