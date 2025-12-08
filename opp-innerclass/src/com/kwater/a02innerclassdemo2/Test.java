package com.kwater.a02innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写后的swim方法");
            }
        };

        method(
                new Animal(){

                    @Override
                    public void eat() {
                        System.out.println("重写后的Animal");
                    }
                }

        );

    }
    public static void method(Animal a){
        a.eat();
    }
}
