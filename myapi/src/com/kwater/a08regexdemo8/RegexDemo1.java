package com.kwater.a08regexdemo8;

public class RegexDemo1 {
    public static void main(String[] args) {
        String qq = "123a4567890";
        boolean result = CheckQQ(qq);
        System.out.println(result);
    }
    public static boolean CheckQQ(String qq){
        int len = qq.length();
        //1.长度为6-20位
        if(len < 6 || len > 20){
            return false;
        }

        //2.不能以0开头
        if(qq.startsWith("0")){
            return false;
        }

        //3.不能含有字母
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
