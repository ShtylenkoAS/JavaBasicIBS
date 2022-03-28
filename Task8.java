package com.max.idea.JavaBasicIBS;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();      //вводит число

        int total = 0;      //в переменной будет подсчет суммы нечетных чисел

        for (int i = 0; i < number; i++) {      //в задании точно не указано считать ли само введеное число, я не считаю
            if ((i % 2) != 0) {
                total = total + i;
            }
        }
        System.out.println("Сумма всех нечетных числе до числа " + number + " (невключительно) составляет: " + total);
    }
}