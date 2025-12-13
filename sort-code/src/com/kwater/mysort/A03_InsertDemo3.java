package com.kwater.mysort;

public class A03_InsertDemo3 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //1.找到无序数组从哪个索引开始
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                startIndex = i + 1;
                break;
            }
        }

        //2.遍历从startIndex开始到最后的数组
        for (int i = startIndex; i < arr.length; i++) {
            //记录
            int j = i;

            while(j > 0 && arr[j] < arr[j-1]){
                //交换位置
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
