package com.kwater.a05bigintegerdemo6;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {

//        BigInteger bd1 = new BigInteger("123456789123456789123456789123456789");
//        System.out.println(bd1);
//
//        BigInteger bd2 = BigInteger.valueOf(123456789L);
//        System.out.println(bd2);

        BigInteger bd3 = BigInteger.valueOf(10);
        BigInteger bd4 = BigInteger.valueOf(2);
        BigInteger bd5 = bd3.add(bd4);
        System.out.println(bd5);

        BigInteger[] bd6 = bd3.divideAndRemainder(bd4);
        System.out.println(bd6[0]);
        System.out.println(bd6[1]);

        BigInteger bd7 = bd3.pow(3);
        System.out.println(bd7);

        BigInteger max = bd3.max(bd4);
        System.out.println(bd3 == max);

    }

}
