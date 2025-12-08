package StringDemo;

public class demo1 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";

        System.out.println(str1 == str2);

        boolean result = str1.equals(str2);
        System.out.println(result);
    }
}
