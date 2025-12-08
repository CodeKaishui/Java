package StringTest;

public class Test3 {
    public static void main(String[] args) {

        String num1 = "1234";
        String num2 = "2345";

        int ret1 = change(num1);
        int ret2 = change(num2);
        System.out.println(ret1 * ret2);

    }
    public static int change(String num){
        char[] arr = new char[num.length()];
        int ret = 0;
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i);
            ret = (arr[i] - '0') + ret * 10;
        }
        return ret;
    }
}
