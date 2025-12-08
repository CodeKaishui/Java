package com.kwater.a10testdemo10;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入1-100的整数，并添加到集合中。
        //直到集合中所有数据和超过100为止

        //1.创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //2.添加数据
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入1-100的整数");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);

            //过滤
            if(num < 1 || num > 100){
                System.out.println("输入的数字不符合要求，请重新输入");
                continue;
            }

            list.add(num);
            int sum = getSum(list);

            if(sum > 200){
                System.out.println("集合中所有数据和超过100");
                break;
            }

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer n = list.get(i);
            sum += n;
        }
        return sum;
    }
}
