package com.kwater.a08regexdemo8;

public class RegexDemo7 {
    public static void main(String[] args) {
        String s = "小诗诗 dqwefqwfqwfq12312 小丹丹 dqwefqwfqwfq12312 小惠惠";

//        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
//        System.out.println(result1);
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
