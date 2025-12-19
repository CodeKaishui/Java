package com.kwater.test;

public class Test2 {
    public static void main(String[] args) {

        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);

//        System.out.println(Fn(12));

    }
//    public static int Fn(int number){
//        if(number == 1 || number == 2){
//            return 1;
//        }
//        return Fn(number - 1) + Fn(number - 2);
//    }
}
