package Demo02;

public class Test3 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,4,5,2,6,7,89,65,540};
        boolean flag = contains(arr,541);
        System.out.println(flag);
    }
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }

        }
        return false;
    }

}
