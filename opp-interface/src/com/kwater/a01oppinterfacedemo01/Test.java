package com.kwater.a01oppinterfacedemo01;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("旺财",1);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.swim();
    }
}
