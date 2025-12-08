package com.kwater.a02oppinterfacedemo02;

public class Test {
    public static void main(String[] args) {
        PingPangSporter pps = new PingPangSporter("zhangsan",23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();

    }
}
