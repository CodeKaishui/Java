package com.kwater.a02ploymorphismdemo02;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color,String name) {
        super(age, color,name);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的"+getName()+"眯着眼睛侧着头吃"+ something);
    }
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
