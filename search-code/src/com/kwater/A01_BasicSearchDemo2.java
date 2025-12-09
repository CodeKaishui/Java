package com.kwater;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79};
        int i = basicSearch(arr, 1);
        System.out.println(i);
    }
    public static int basicSearch(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number)
                return i;
        }
        return -1;
    }
}
