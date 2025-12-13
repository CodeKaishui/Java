package com.kwater.mysort;

public class A04_RecursionDemo4 {
    public static void main(String[] args) {
//        System.out.println(getSum(100));
        System.out.println(getFactorialRecursion(5));
    }

    public static int getFactorialRecursion(int number){
        if(number == 1 || number == 0){
            return 1;
        }
        return number*getFactorialRecursion(number - 1);

    }
    public static int getSum(int number){
        if(number == 1){
            return 1;
        }
        return number + getSum(number - 1);
    }
}
