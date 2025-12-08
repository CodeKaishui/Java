package com.kwater.a08regexdemo8;

public class RegexDemo2 {
    public static void main(String[] args) {
        String regex1 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex1));
        System.out.println("02122442".matches(regex1));
        System.out.println("027-42424".matches(regex1));
        System.out.println("0712-3242434".matches(regex1));

        //15:02:00
        String regex2 = "([01]\\d|2[0-3])(:[0-5]\\d){2}";

        System.out.println("00:00:00".matches(regex2));
    }
}
