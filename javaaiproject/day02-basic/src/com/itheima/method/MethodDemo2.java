package com.itheima.method;

public class MethodDemo2 {
    public static void main(String[] args) {

        getDiv(10,0);
    }

    //需求:写一个除法的方法
    public static void getDiv(int a,int b) {
        if (b == 0) {
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(a / b);
    }

}
