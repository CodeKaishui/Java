package Test5;

import java.util.GregorianCalendar;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];

        GirlFriend gf1 = new GirlFriend("1",18,"女","学习");
        GirlFriend gf2 = new GirlFriend("2",19,"女","学习");
        GirlFriend gf3 = new GirlFriend("3",22,"女","学习");
        GirlFriend gf4 = new GirlFriend("4",24,"女","学习");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
             sum += gf.getAge();
        }
        int avg = sum / arr.length;
        System.out.println("平均年龄为：" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if(gf.getAge() < avg){
                count++;
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," + gf.getGender());
            }
        }

        System.out.println("低于平均年龄的个数为：" + count);
    }
}
