package StringTest;

import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Phone> list = new ArrayList<>();

        //2.存入三个手机对象
        list.add(new Phone("小米",1000));
        list.add(new Phone("苹果",8000));
        list.add(new Phone("锤子",2999));

        //3.定义方法将低于3000的手机返回
        ArrayList<Phone> result = getPhone(list);


        //4.遍历集合
        for (int i = 0; i < result.size(); i++) {
            Phone p = result.get(i);
            System.out.println(p.getBrand() + ", " + p.getPrice());
        }
    }
    public static ArrayList<Phone> getPhone(ArrayList<Phone> list){
        ArrayList<Phone> ListResult = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            if(p.getPrice() < 3000){
                ListResult.add(list.get(i));
            }
        }
        return ListResult;
    }
}
