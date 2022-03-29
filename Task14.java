package com.max.idea.JavaBasicIBS;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((20 - (-20)) + 1)) + (-20);      //((20 - (-20)) + 1)) + (-20) - задание границ генерации чисел
        }

        System.out.println("Сгенерированный массив: ");
        System.out.println(Arrays.toString(array));

        int max = 0;
        int min = 0;

        for (int j : array) {
            max = Math.max(max, j);
            min = Math.min(min, j);
        }

        int max_abs;
        max_abs = Math.max(Math.abs(max), Math.abs(min));

        System.out.println("Максимальное значение элемента в массиве: " + max);
        System.out.println("Минимальное значение элемента в массиве: " + min);
        System.out.println("Наибольшее значение по модулю: " + max_abs);
    }
}
