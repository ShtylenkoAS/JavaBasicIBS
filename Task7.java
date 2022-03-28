package com.max.idea.JavaBasicIBS;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");
        int dimension = scanner.nextInt();      //длина массива
        double[] myArray = new double[dimension];       //создание массива с переменной длинной

        double[] constants = new double[]{5, 8, 12};       //завел константы

        for (int i = 0; i < dimension; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            myArray[i] = scanner.nextDouble();
        }

        boolean sign = false;   //завел индикатор

        for (double constant : constants) {
            for (double v : myArray) {
                if (constant == v) {
                    sign = true;        //индикатор переведется в true, если введенное значение совпадет с заданными константами
                }
            }
            if (sign) {
                System.out.println("Введенное значение содержится в константах");
                break;
            }
        }
    }
}
