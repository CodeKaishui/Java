package com.itheima.method;

public class MethodDemo1 {
    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println("和是:" + sum);

        System.out.println("===========================");

        int sum2 = getSum(100,200);
        System.out.println("和是:" + sum2);

        System.out.println("===========================");

        printHelloWorld();

        System.out.println("===========================");

        String code = getCode(6);
        System.out.println("验证码是:" + code);
        System.out.println(getCode(5));

    }

    //定义一个方法，求两个任意整数的和,并返回结果
    public static int getSum(int a,int b) {
        return a + b ;
    }

    //打印3行HelloWorld，不需要参数，不需要返回值
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }

    //获取一个指定位数的验证码返回
    public static String getCode(int length) {
        String code = "";
        for (int i = 0; i < length; i++) {
            int number = (int)(Math.random() * 10);
            code += number;
        }
        return code;
    }

}
