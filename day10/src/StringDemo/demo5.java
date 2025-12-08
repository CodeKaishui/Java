package StringDemo;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = revers(str);
        System.out.println(str);

    }

    public static String revers(String str){
        String result = "";
        for (int i = str.length() - 1; i >=0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
