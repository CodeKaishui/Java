package StringTest;

public class Test4 {
    public static void main(String[] args) {
        String s = "hello ww";
        int count = 0;
        for (int i = s.length() -1 ; i > 0; i--) {
            char c = s.charAt(i);
            if(c == ' '){
                break;
            }
            ++count;
        }
        System.out.println(count);
    }
}
