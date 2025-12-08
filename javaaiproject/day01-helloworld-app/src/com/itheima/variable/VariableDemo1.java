package com.itheima.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        //调用方法
        study();
    }

    //定义一个方法
    public static void study() {
        //局部变量
        double money = 3000;
        System.out.println(money);
        money = money - 1000;
        System.out.println(money);
        money= money + 5000;
        System.out.println(money);

        System.out.println("===================================");

        char ch = 'A';
        System.out.println(ch + 1);

        System.out.println("===================================");

        int i1 = 0B0111;
        System.out.println(i1);

        int i2 = 0435;
        System.out.println(i2);

        int i3 = 0XAF;
        System.out.println(i3);
    }
}
