package stringbuilderdemo;

import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        //录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //反转
        String result = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);

        //判断是否对称
        if(str.equals(result)){
            System.out.println("对称");
        }else{
            System.out.println("不对称");

        }
        }
}
