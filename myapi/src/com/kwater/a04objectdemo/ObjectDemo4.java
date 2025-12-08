package com.kwater.a04objectdemo;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        User u1 = new User(1,"张三","123456","1.png",arr);

        User u2 = (User)u1.clone();
        System.out.println(u1);
        System.out.println(u2);


    }
}
