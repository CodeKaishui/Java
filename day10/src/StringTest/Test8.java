package StringTest;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.存入三个用户对象
        list.add(new User("1","zhangsan","123456"));
        list.add(new User("2","lisi","1234567"));
        list.add(new User("3","wangwu","12345678"));

        //3.定义一个方法根据id查询用户
        int flag = getIndex(list, "5");

        boolean contains = contains(list, "5");

        //4.输出结果
        System.out.println(flag);
        System.out.println(contains);

    }

    //查询用户是否存在，返回布尔
    public static boolean contains(ArrayList<User> list,String id){
        return getIndex(list,id) > 0;
    }

    //查询用户的索引
    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
