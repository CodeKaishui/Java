package StringDemo;

import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        //获取要说的话
        Scanner sc = new Scanner(System.in);
        String talk = sc.next();

        //敏感词
        String[] arr = {"傻", "傻X", "傻B",};

        //敏感词替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
