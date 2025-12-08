package com.kwater.a01mathdemo1;

public class Test1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            boolean flag = isPrime1(i);
            if(flag){
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end -  start);
    }
    public static boolean isPrime1(int number){
        int count = 0;
        for(int i = 2; i <= Math.sqrt(number); i++){
            count++;
            if(number % i == 0){
                return false;
            }
        }
     return false;
    }

    public static boolean isPrime2(int number){
        int count = 0;
        for(int i = 2; i < number; i++){
            count++;
            if(number % i == 0){
                return false;
            }
        }
        return false;
    }

}
