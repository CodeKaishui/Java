package stringbuilderdemo;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        int len = getStr().substring(1).replace("B", "Q").length();
        System.out.println(len);

    }
    public static String getStr(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }
}
