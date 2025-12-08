package StringDemo;

public class demo8 {
    public static void main(String[] args) {
        //1.身份证号
        String id = "123321202510270050";
        //2.截取年月日
        String year = id.substring(6,10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
       //3.获取性别
        char c = id.charAt(16);
        int num = c - 48;
        System.out.println("人物信息为：");
        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
        //4.判断性别
        if(num %2 == 0){
            System.out.println("性别为：女");
        }else{
            System.out.println("性别为：男");
        }

    }
}
