package com.kwater.a02oppinterfacedemo02;

public class BasketballSporter extends Sporter{
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习蓝球");
    }
}
