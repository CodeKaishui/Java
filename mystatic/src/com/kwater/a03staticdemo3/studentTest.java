package com.kwater.a03staticdemo3;

import java.util.ArrayList;

public class studentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",23,"男");
        Student stu2 = new Student("李四",24,"男");
        Student stu3 = new Student("王五",25,"男");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
