package StringTest;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", 18);
        Student s2 = new Student("lisi", 18);
        Student s3 = new Student("wangwu", 18);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
