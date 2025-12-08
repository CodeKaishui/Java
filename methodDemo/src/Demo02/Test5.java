package Demo02;

public class Test5 {
    public static void main(String[] args) {
        //定义要被拷贝的数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] copy = copyOfRange(arr,3,7);

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }


    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        //定义数组
        int[] newArr = new int[to - from];

        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;

    }



}
