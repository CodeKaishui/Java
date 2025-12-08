package com.kwater.a03oppinterfacedemo03;

public class Test {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();

        InterImpl2 ii2 = new InterImpl2();
        ii2.show(ii);
    }
}
