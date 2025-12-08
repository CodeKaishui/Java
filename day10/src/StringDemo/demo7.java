package StringDemo;

public class demo7 {
    public static void main(String[] args) {
        //1.手机号码
        String phoneNumber = "13112349468";
        //2.截取前3位
        String star = phoneNumber.substring(0,3);
        //3.截取后四位
        String end = phoneNumber.substring(7);
        //4.拼接
        String result = star + "****" + end;
        //5.打印
        System.out.println(result);
    }
}
