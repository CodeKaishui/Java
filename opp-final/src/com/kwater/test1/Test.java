package com.kwater.test1;


import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {

    }
}

class Fu{
    public  void show(){
        System.out.println("父类方法");
    }
}

class Zi extends Fu{
    @Override
    public void show(){
        System.out.println("子类方法");
    }
}
