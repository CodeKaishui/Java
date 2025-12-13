package com.kwater.mysort;

import java.util.Random;

public class A04_RecursionDemo4_1 {
    public static void main(String[] args) {
//        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        int[] arr = new int[10000];

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();

        System.out.println(end - start);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量记录要查找的值
        int start = i;
        int end = j;

        if(start > end){
            return;
        }

        //基准数
        int baseNumber = arr[i];

        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }

            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //基准数归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);

    }
}
