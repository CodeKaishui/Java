package StringDemo;

public class Test1Case1 {
    public static void main(String[] args) {
        //1.定义两个旋转比较的字符串
        String strA = "abcde";
        String strB = "cdeab";

        //2旋转操作，成功返回true,失败返回false
        boolean result = check(strA,strB);

        //3输出结果
        System.out.println(result);

    }

    public static boolean check(String strA,String strB){
        //循环旋转
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }


    public static String rotate(String str){
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }
}
