package com.max.idea.JavaBasicIBS;

import java.util.UUID;
import java.util.Scanner;
import java.util.Arrays;

public class generateRquid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter len of massive: ");
        int len = scanner.nextInt();
        String[] massive = new String[len];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        }
        //String rquid = UUID.randomUUID().toString().replace("-", "");
        int len_rq = massive[1].length();
        System.out.println("Generated massive: ");
        for (String s : massive) {
            System.out.println(s);
        }
        System.out.println("Length each rquid: " + len_rq);
    }
}
