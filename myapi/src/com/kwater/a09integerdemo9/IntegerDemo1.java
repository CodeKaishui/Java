package com.kwater.a09integerdemo9;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //整数转换二进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        //整数转换八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        //整数转换十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        int i = Integer.parseInt("100");
        System.out.println(i);
        System.out.println(i + 1);
    }
}
