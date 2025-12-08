package main;

public class Test3 {
    public static void main(String[] args) {
        int[][] arr ={
                {22,66,44},
                {33,55,77},
                {11,99,88},
                {33,55,77}
        };
        int money = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = getSum(arr[i]);
            System.out.println("第"+(i+1)+"个季度的营业额"+sum+"元");
            money += sum;
        }
        System.out.println("全年的营业额为:"+money);

    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
