package com.kwater.a02ploymorphismdemo02;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王",30);
        Person p2 = new Person("老李",25);
        Dog d = new Dog(2,"黑","狗");
        Cat c = new Cat(3,"灰","猫");
        p.keepPet(d,"骨头");
        p2.keepPet(c,"鱼");
    }
}
