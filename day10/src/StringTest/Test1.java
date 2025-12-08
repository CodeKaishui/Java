package StringTest;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = sc.next();

        //字符串变成字符数组
        char[] arr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[r.nextInt(arr.length)];
        }

        str = new String(arr);
        System.out.println(str);


    }
}
