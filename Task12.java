package com.max.idea.JavaBasicIBS;

public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        boolean check1 = str.contains("Java");
        boolean check2 = str.startsWith("I like");
        boolean check3 = str.endsWith("!!!");

        if (check1 && check3 && check3) {
            System.out.println(str.toUpperCase());
        }

        String str2 = str.replace("a", "o");
        System.out.println(str2.substring(str.indexOf('J'), str.replace("!", "").length()));
    }
}
