package StringDemo;

public class Test1Case2 {
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
        //转换为字符数组
        char[] chars = str.toCharArray();
        //获取第一个字符
        char first = chars[0];
        //剩余的字符依次往后移动
        for (int i = 1; i < chars.length; i++) {
            chars[i - 1] = chars[i];
        }
        //把第一个放到最后
        chars[chars.length -1] = first;
        String result = new String(chars);
        return result;
    }
}
