package Demo02;

public class Test2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,4,7,2,3,9,0,8,15};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
