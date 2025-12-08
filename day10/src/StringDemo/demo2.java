package StringDemo;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        String rightUsername = "admin";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 2; i >= 0; i--) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("登录成功");
                break;
            }else{
                if(i == 0){
                    System.out.println("账户被锁定");
                }else{
                    System.out.println("用户名或密码错误,还剩下"+i+"次机会");
                }

            }
        }
    }
}
