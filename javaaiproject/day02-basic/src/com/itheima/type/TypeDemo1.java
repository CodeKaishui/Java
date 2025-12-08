package com.itheima.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        //目标:认识自动类型转换
        byte a = 10;
        print(a);//自动类型转换
        print2(a);//自动类型转换

        System.out.println("===========================");

        int i = 100;
        byte i1 = (byte) i;
        print3(i1);

        int i2 = 1500;
        byte i3 = (byte)  i2;

        print(i3);

    }

    public static void print(int b) {
        System.out.println(b);
    }

    public static void print2(double b) {
        System.out.println(b);
    }

    public static void print3(byte b) {
        System.out.println(b);
    }
}
