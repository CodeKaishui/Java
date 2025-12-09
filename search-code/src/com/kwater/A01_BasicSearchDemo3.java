package com.kwater;

import java.util.ArrayList;

public class A01_BasicSearchDemo3 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79,131};
        ArrayList<Integer> index = basicSearch(arr, 131);
        for (int i = 0; i < index.size(); i++) {
            Integer i1 = index.get(i);
            System.out.print(i1 + " ");
        }

    }
    public static ArrayList<Integer> basicSearch(int[] arr, int number){
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                index.add(i);
            }
        }
        return index;
    }

}
