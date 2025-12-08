package com.kwater.a10testdemo10;

public class Test2 {
    public static void main(String[] args) {
        //自己实现 parseInt 方法的效果，将字符串形式的数据转成整数。要求：
        //字符串中只能是数字不能有其他字符
        //最少一位，最多 10 位
        //0 不能开头

        //1.定义字符串
        String str = "123";
        //最终的数字
        int number = 0;
        //2.判断是否符合要求
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("不符合要求");
        }else{
           
            System.out.println("符合要求");
            //3.把字符串中每一位数据拿出来处理
            for (int i = 0; i < str.length(); i++) {
                int num = str.charAt(i) - '0';
                number = number * 10 + num;
            }
        }

        //4.输出结果
        System.out.println(number);
        System.out.println(number + 1);
    }
}
