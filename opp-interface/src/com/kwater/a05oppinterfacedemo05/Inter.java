package com.kwater.a05oppinterfacedemo05;

public interface Inter {
    public default void show1(){
        System.out.println("show1方法执行");
        show3();
    }

    public static void show2(){
        System.out.println("show2方法执行");
        show4();
    }

    private void show3(){
        System.out.println("给默认方法使用");
    }

    private static void show4(){
        System.out.println("给静态方法使用");
    }

}
