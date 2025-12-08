import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] scoreArr = scores();

        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);

        sum = (sum - max - min)/(scoreArr.length-2);
        System.out.println("选手的得分为:"+sum);


    }
    //求最大值
    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] > max){
                max = scoreArr[i];
            }
        }
        return max;
    }
    //求最小值
    public static int getMin(int[] scoreArr){
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(scoreArr[i] < min){
                min = scoreArr[i];
            }
        }
        return min;
    }
    //求总分
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

    public static int[] scores(){
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("录入评委的打分：");
            int score = sc.nextInt();
            if(score >= 0 && score <=100){
                scores[i] = score;
                i++;
            }else{
                System.out.println("输入不合法,当前的i为"+i);
            }
        }
        return scores;
    }

}
