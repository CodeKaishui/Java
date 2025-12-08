package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        //目标:掌握基本的8个数据类型
        method();
    }
    public static void method(){
        //基本数据类型
        //1.整数类型
        //1.1 byte
        byte b = 127;
        System.out.println(b);
        //1.2 short
        short s = 32767;
        System.out.println(s);
        //1.3 int
        int i = 2147483647;
        System.out.println(i);
        //1.4 long
        long l = 9223372036854775807L;
        System.out.println(l);


        //2.小数类型
        //2.1 float
        float f = 3.14F;
        System.out.println(f);
        //2.2 double
        double d = 3.14;
        System.out.println(d);

        //3字符
        char ch = 'a';
        System.out.println(ch);

        //4.布尔类型
        //4.1 boolean
        boolean bb = true;
        System.out.println(bb);

        //5字符串类型
        String str = "hello world";
        System.out.println(str);
    }
}
