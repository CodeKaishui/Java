package StringTest;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('A' + i);
            arr[i + 26] = (char) ('a' + i);
        }
        String str = "";
        Random r = new Random();

        for(int i = 0 ; i < 4; i++){
            str = str + arr[r.nextInt(arr.length)];
        }

        int i = r.nextInt(10);
        str += i;

        char[] chars = str.toCharArray();
        char temp = chars[chars.length-1];
        chars[chars.length-1] = chars[r.nextInt(chars.length-1)];
        chars[r.nextInt(chars.length-1)] = temp;

        str = new String(chars);
        System.out.println(str);



    }
}
