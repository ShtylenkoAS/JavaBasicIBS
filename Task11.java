package com.max.idea.JavaBasicIBS;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        String number1 = scanner.nextLine();

        System.out.println("Введите число 2: ");
        String number2 = scanner.nextLine();

        int number2ToInt = Integer.parseInt(number2);

        double number1ToDouble = Double.parseDouble(number1);

        double max =  Math.max(number1ToDouble, number2ToInt);
        System.out.println("Максимальное число из введенных данных: " + max);

        double min = Math.min(number1ToDouble, number2ToInt);
        System.out.println("Минимальное число из введенных данных: " + min);
    }
}
