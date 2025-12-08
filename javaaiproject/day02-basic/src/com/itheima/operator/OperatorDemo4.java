package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标:掌握三元运算符
        print(80);
        System.out.println(getMax(10, 20, 30));
        System.out.println(getMax2(10, 20, 30));
    }


    public static void print(int score){
        String result = score >= 60 ? "通过" : "不通过";
        System.out.println(result);
    }


    public static int getMax(int a , int b, int c){
        int max = a > b ? a : b;
        max = max > c ? max : c;
        return max;
    }

    public static int getMax2(int a , int b, int c){
        int max =  a > b ? (a > c ? a : c ): (b > c ? b : c);
        return max;

    }
}
