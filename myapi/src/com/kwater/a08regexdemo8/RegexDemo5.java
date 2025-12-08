package com.kwater.a08regexdemo8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String s = "Java 自从 95 年问世以来，经历了很多版本，目前企业中用的最多的是 Java8 和 Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是 Java17，相信在未来不久 Java17 也会逐渐登上历史舞台";

        String regex = "Java(?=8|11|17)";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
