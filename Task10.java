package com.max.idea.JavaBasicIBS;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк в матрице: ");
        int lines = scanner.nextInt();

        System.out.println("Введите количество столбцов в матрице: ");
        int columns = scanner.nextInt();

        double[][] matrix = new double[lines][columns];     //переменная для хранения двумерного массива

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Введите следюущий элемент матрицы: " + (i + 1) + "-я строка, " + (j + 1) + "-й столбец");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Вы ввели следующую матрицу: " + Arrays.deepToString(matrix));

        double[] mult_matrix = new double[columns];     //переменная для хранения элементов из введенной матрицы

        for (int i = 0; i < 1; i++) {       //цикл дня наполнение массива mult_matrix первой строкой matrix
            for (int j = 0; j < columns; j++) {
                mult_matrix[j] = matrix[i][j] * 3;
            }
        }

        for (int i = 0; i < 1; i++) {       //цикл для умножения первой строчки матрицы matrix на 3
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = matrix[i][j] * 3;
            }
        }

        System.out.println("Вывод матрицы, но элементы 1-ой строки помноженны на 3: " + Arrays.deepToString(matrix));
        System.out.println("Вывод толкьо первой строки матрицы с элементами помноженными на 3: " + Arrays.toString(mult_matrix));
    }
}
