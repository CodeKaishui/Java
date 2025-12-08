import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[]arr = createNum();
        System.out.println("中奖号码");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //2.用户输入号码

        int[] userArr = userInputNumber();

        //3.判断中间
        int redCount = 0;
        int blueCount = 0;

        //判断红球个数
        for (int i = 0; i < userArr.length - 1; i++) {
            int redNumber = userArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    break;
                }
            }
        }

        //判断蓝球个数
        int blueNumber = userArr[userArr.length - 1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount++;
        }

        if(redCount == 6 && blueCount == 1){
            System.out.println("中了1000万");
        }else if(redCount == 6 ){
            System.out.println("中了500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("中了3000");
        }else if((redCount == 5) ||(redCount == 4 && blueCount == 1)){
            System.out.println("中了200");
        }else if((redCount == 4) ||(redCount == 3 && blueCount == 1)){
            System.out.println("中了10");
        }else if((redCount == 2 && blueCount == 1) ||(redCount == 1 && blueCount == 1)||(redCount == 0 && blueCount == 1)){
            System.out.println("中了5");
        }

    }
    public static int[] userInputNumber(){
        //6个红球 一个蓝球
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球(1~33)");
            int redNumber = sc.nextInt();
            if(redNumber >=1 && redNumber <=33){
                boolean flag = is(arr,redNumber);
                if(!flag){
                    arr[i] = redNumber;
                    i++;
                }else{
                    System.out.println("红球重复，请重新输入");
                }
            }else{
                System.out.println("输入的红球范围错误");
            }
        }


        while(true){
            //输入蓝球
            System.out.println("请输入蓝球号码(1~16)");
            int blueNumber = sc.nextInt();
            if(blueNumber >=1 && blueNumber <=16){
                arr[arr.length - 1] = blueNumber;
                break;
            }else{
                System.out.println("输入的蓝球范围错误");
            }
        }

        return arr;
    }

    public static int[] createNum(){
        //6个红球 一个蓝球
        int[] arr = new int[7];
        //红球不能重复 蓝球可以跟红球重复
        Random r = new Random();
        //生成红球号码存放到数组中
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33)+1;
            boolean flag = is(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码，放到数组的最后一位
        int blueNumber = r.nextInt(16)+1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //判断生成的红球号码是否重复
    public static boolean is(int[] arr,int redNumber){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == redNumber){
                return true;
            }
        }
        return false;

    }

}
