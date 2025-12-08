package com.kwater.a02ploymorphismdemo02;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void keepPet(Animal a,String something){
        if(a instanceof Dog d){
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+d.getAge()+"岁的"+d.getColor()+"颜色的"+d.getName()+"。");
            d.eat(something);
        }else if(a instanceof Cat c){
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+c.getAge()+"岁的"+c.getColor()+"颜色的"+c.getName()+"。");
            c.eat(something);
        }
    }
}
