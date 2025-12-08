import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //键盘录入机票原价
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();

        //录入月份
        System.out.println("请输入月份");
        int month = sc.nextInt();

        //录入舱位
        System.out.println("请选择舱位 0头等舱 1经济舱");
        int seat = sc.nextInt();

        if(month >=5 && month <=10){
            ticket = getPrice(ticket,seat,0.8,0.75);
        }else if((month >= 11 && month <= 12) || (month >=1 && month <= 4)){
            ticket = getPrice(ticket,seat,0.7,0.65);
        }
        System.out.println("机票价格"+ ticket);

    }
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if(seat == 0){
            //头等舱
            ticket = (int)(ticket * v0);
        }else if(seat == 1){
            //经济舱
            ticket = (int)(ticket * v1);
        }else{
            System.out.println("输入错误");
        }
        return ticket;
    }
}
