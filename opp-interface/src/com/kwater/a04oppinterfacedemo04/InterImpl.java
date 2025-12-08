package com.kwater.a04oppinterfacedemo04;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("重写后的抽象方法");
    }

    public static void show(){
        System.out.println("实现类中的静态方法");
    }
}
