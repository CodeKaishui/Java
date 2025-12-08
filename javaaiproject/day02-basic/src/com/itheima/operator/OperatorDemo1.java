package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //目标：搞清楚基本的算术运算符
        getOperator();

        System.out.println("===========================");
        getOperator1();

    }

    //需求：研究一下+这个是作运算符还是连接符
    public static void getOperator1() {
        int a = 5;
        System.out.println("abc" + a);//abc5
        System.out.println(a + 5);//10
        System.out.println("itheima" + a +'a');//itheima5a
        System.out.println(a + 'a' + "itheima");//102itheima
    }



    //帮我写一个方法，里面是基本算数运算符
    public static void getOperator() {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);

        System.out.println(a + b + "hello");
        System.out.println("hello" + a + b);
        System.out.println("hello" +(a + b));
    }




}
