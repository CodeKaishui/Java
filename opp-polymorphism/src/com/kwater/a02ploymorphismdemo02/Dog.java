package com.kwater.a02ploymorphismdemo02;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color,String name) {
        super(age, color,name);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的"+getColor()+"颜色的"+getName()+"两只前腿死死的抱住"+something+"猛吃");
    }
    public void lookHome(){
        System.out.println("看家");
    }

}
