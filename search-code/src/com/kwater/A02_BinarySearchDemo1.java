package com.kwater;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围
        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 7));
    }
    public static int binarySearch(int[] arr,int number){
        //1.定义两个索引，一个指向数组的开始索引，一个指向数组的结束索引
        int min = 0;
        int max = arr.length - 1;

        //2.循环查找
        while(true){
            if(min > max){
                return -1;
            }

            //3.获取中间索引
            int mid = (min + max) / 2;

            //4.判断
            if(arr[mid] > number){
                //number在mid的左边
                //min不变
                max = mid -1;
            }else if(arr[mid] < number){
                //number在mid的右边
                //max不变
                min = mid + 1;
            }else{
                //找到了
                return mid;
            }
        }
    }
}
