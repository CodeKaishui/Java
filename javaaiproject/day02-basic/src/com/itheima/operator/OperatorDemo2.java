package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //理解自增自减运算符
        getOperator();

        System.out.println("===========================");

        getOperator2();



    }

    //看一下变量用自增自减的区别
    public static void getOperator2() {
        int a = 10;
        int b = a++; //先用后加
        System.out.println(a);//11
        System.out.println(b);//10

        int c = ++a;
        System.out.println(a);//12
        System.out.println(c);//12
    }

    public static void getOperator() {
        int a = 10;
        a++;
        ++a;
        System.out.println(a);

        a--;
        --a;
        System.out.println(a);
    }
}
