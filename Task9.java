package com.max.idea.JavaBasicIBS;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int len = scanner.nextInt();        //вводит длинну массива
        double[] myArray = new double[len];       //создание массива с переменной длинной

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            myArray[i] = scanner.nextDouble();
        }
        double total = 0;       //сумма элементов массива
        double median = 0;      //переменная для подсчета среднего арифметического

        for (int i = 0; i < myArray.length; i++) {
            total = total + myArray[i];
        }
        median = total / myArray.length;

        System.out.println("Введенный масив: " + Arrays.toString(myArray));
        System.out.println("Рассчитаное срднее арифметическое: " + median);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] * median;
        }
        System.out.println("Введенный масив, помноженный на среднее арифметическое: " + Arrays.toString(myArray));
    }
}
