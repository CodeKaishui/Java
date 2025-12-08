package stringbuilderdemo;

public class demo5 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1,2,3};
        //2.调用方法返回字符串
        String result = arrToString(arr);
        //3.打印
        System.out.println(result);
    }
    public static String arrToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

