package com.kwater.a01staticdemo1;

public class studentTest {
    public static void main(String[] args) {
        Student.teacherName = "王老师";
        Student s1 = new Student("张三",23,"男");
        Student s2 = new Student("李四",24,"男");
        s1.show();
        s2.show();

    }
}
