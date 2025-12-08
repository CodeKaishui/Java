package Test4;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("小米", 1999, "黑色");
        Phone p2 = new Phone("华为", 4999, "红色");
        Phone p3 = new Phone("苹果", 3999, "蓝色");
        
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            Phone p = arr[i];
            sum += p.getPrice();
        }

        double avg = sum * 1.0 / arr.length;
        System.out.println("平均价格：" + avg);
    }
}
