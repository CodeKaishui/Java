import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //输入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        //计算整数的长度
        while(number != 0){
            number = number / 10;
            count++;
        }

        //定义一个数组
        int[] arr = new int[count];
        int index = arr.length -1;

        //把整数的每一位保存到数组中
        while (temp != 0) {
            arr[index] = temp % 10;
            temp /= 10;
            index--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
