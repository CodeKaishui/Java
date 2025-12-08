package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //目标：掌握扩展的赋值运算符
        getRedPacket();
    }

    //需求：收红包
    public static void getRedPacket() {
        int money = 100;
        money += 10;  //等价于(money的类型)money = money + 10;
        System.out.println(money);//110
        money -= 10; //等价于(money的类型)money = money - 10;
        System.out.println(money);//100
        money *= 10;//等价于(money的类型)money = money * 10;
        System.out.println(money);//1000
        money /= 10;//等价于(money的类型)money = money / 10;
        System.out.println(money);//100
        money %= 10;//等价于(money的类型)money = money % 10;
        System.out.println(money);//
    }
}
