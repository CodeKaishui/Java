public class test2 {
    public static void main(String[] args) {

        //判断101-200之间有多少个素数
        int count = 0;
        //循环得到101-200的每一个数字
        for (int i = 101; i <= 200; i++) {
            //判断素数
            boolean flag = true;
            //循环判断当前数是否为质数
            for(int j =2; j < i; j++){
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                System.out.println(i+"是素数");
            }

        }
        System.out.println("共有"+count+"个素数");


    }
}
