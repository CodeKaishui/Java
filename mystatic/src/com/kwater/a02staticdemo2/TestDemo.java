package com.kwater.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,50,34,100};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr2 = {10.1,20.2,50.3,34.4,100.5};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
