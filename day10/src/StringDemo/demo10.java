package StringDemo;

import java.util.Scanner;

public class demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        while(true){
            System.out.println("请输入一个字符串");
            str = sc.next();
            if(checkStr(str)){
                break;
            }else {
                System.out.println("输入的字符串不合法");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            String s = changeLuoMa(c);
            sb.append(s);
        }

        System.out.println(sb);

    }

    public static String changeLuoMa(char c){
        String str;
        switch(c){
            case '0' -> str = "";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = " ";
        }
        return str;

    }


    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }

        return true;
    }

}
