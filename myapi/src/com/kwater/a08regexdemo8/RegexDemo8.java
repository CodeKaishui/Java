package com.kwater.a08regexdemo8;

public class RegexDemo8 {
    public static void main(String[] args) {
        //1.判断一个字符串的开始字符和结束字符是否一致?单个字符
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("1891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));

        System.out.println("================================");

        //2.判断一个字符串的开始部分和结束部分是否一致? 可以有多个字符
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abc".matches(regex2));

        System.out.println("================================");

        //3.判断一个字符串的开始字符和结束字符是否一致? 开始部分每个字符要一致

        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("&&abc&1".matches(regex3));
    }
}
