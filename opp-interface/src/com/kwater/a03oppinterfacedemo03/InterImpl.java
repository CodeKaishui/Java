package com.kwater.a03oppinterfacedemo03;



public class InterImpl implements InterA,InterB{
    @Override
    public void method() {
        System.out.println("重写的抽象方法");
    }

//    @Override
//    public void show() {
//        System.out.println("重写后的默认方法");
//    }
}
