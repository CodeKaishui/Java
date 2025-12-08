package com.kwater.a04objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(str.equals(sb));
        System.out.println(sb.equals(str));
    }
}
