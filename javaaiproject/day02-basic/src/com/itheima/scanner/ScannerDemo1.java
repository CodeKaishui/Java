package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        getUserInfo();

    }


    //需求：我是一个零基础小白，请我帮我写一个程序，可以让用户键盘输入用户名和年龄，然后打印出来
    public static void getUserInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");

        String name = sc.next();
        System.out.println("您叫" + name);

        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("您今年" + age + "岁");




    }
}
