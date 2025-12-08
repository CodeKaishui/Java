import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        char[] chs = new char[52];

        for (int i = 0; i < chs.length; i++) {
            if(i < 26){
                chs[i] = (char)('a' + i);
            }else{
                chs[i] = (char)('A' + i - 26);
            }
        }
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }

        int randomInt = r.nextInt(10);
        System.out.println(result + randomInt);
    }
}
