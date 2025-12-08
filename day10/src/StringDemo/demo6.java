package StringDemo;

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        int money = 0;
        while(true){
            System.out.println("请输入金额");
             money = sc.nextInt();
            if(money >0 && money <= 9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }

        //2金额转换
        String moneyStr = "";
        while(true){
            int ge = money %10;
            money /= 10;
            String c = change(ge);
            moneyStr = c + moneyStr;
            if(money == 0){
                break;
            }
        }

        //3补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        String result = "";
        //4插入单位
        String[] units = {"佰","拾","万","仟","佰","拾","元d    j"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + units[i];
        }
        System.out.println(result);
        
    }
    public static String change(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
