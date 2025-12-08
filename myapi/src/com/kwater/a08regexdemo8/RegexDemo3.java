package com.kwater.a08regexdemo8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String str = "Java 自从 95 年问世以来，经历了很多版本，目前企业中用的最多的是 Java8 和 Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是 Java17，相信在未来不久 Java17 也会逐渐登上历史舞台";

        String regex = "Java\\d{0,2}";
        //1.获取正则表达式的对象
        Pattern p = Pattern.compile(regex);
        //2.获取文本匹配器的对象
        Matcher m = p.matcher(str);
        //3.利用循环获取
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }
    }
}
