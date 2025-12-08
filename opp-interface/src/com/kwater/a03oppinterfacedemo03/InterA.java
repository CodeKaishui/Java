package com.kwater.a03oppinterfacedemo03;

public interface InterA {

    public abstract void method();
    public default void show(){
        System.out.println("InterA接口的默认方法");
    }
}
