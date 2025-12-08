package stringbuilderdemo;

public class demo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

//        sb.append(1);
//        sb.append(1.2);
//        sb.append(true);
//        System.out.println(sb);

        sb.reverse();
        int len = sb.length();
        System.out.println(len);
        System.out.println(sb);

    }
}
