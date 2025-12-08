package stringbuilderdemo;

public class demo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        sb.append("aaa").append("bbb");
        System.out.println(sb);
    }
}
