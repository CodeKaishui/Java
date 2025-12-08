package com.kwater.a01ploymorphismdemo01;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();

        if(a instanceof Dog d){
            d.lookHome();
        }else if(a instanceof Cat c){
            c.catchMouse();
        }

    }
}
class Animal{
    public void show(){
        System.out.println("Animal --- show");
    }
}

class Dog extends Animal{
    @Override
    public void show(){
        System.out.println("Dog --- show");
    }

    public void lookHome(){
        System.out.println("Dog 正在看家");
    }
}

class Cat extends Animal{
    @Override
    public void show(){
        System.out.println("Cat --- show");
    }
    public void catchMouse(){
        System.out.println("Cat 抓老鼠");
    }
}
