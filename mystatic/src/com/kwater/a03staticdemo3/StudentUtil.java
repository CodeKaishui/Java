package com.kwater.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {
    }

    public static int getMaxAge(ArrayList<Student> list){
        //1.参照物
        int max = list.get(0).getAge();

        //2.循环得到最大值
        for (int i = 1; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if(tempAge > max){
                max = tempAge;
            }
        }

        //3.返回最大值
        return max;
    }
}
