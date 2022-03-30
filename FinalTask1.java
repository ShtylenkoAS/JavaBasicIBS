package com.max.idea.JavaBasicIBS;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FinalTask1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double curs = getCurs();
        double ruble = getRuble();
        BigDecimal dollar = calc(curs, ruble);
        System.out.println("Результат конвертации: " + dollar);
    }

    public static double getCurs() {
        System.out.println("Введите текущий курс доллара: ");
        double num;
        if (scanner.hasNextDouble()) {   //проверка на то, что ввели число типа double
            num = scanner.nextDouble();
        } else {
            System.out.println("Ошибка при вводе числа, введите корректное число");
            scanner.next();     //рекурсия
            num = getCurs();
        }
        return num;
    }

    public static double getRuble() {
        System.out.println("Введите количество рублей: ");
        double num;
        if (scanner.hasNextDouble()) {   //проверка на то, что ввели число типа double
            num = scanner.nextDouble();
        } else {
            System.out.println("Ошибка при вводе числа, введите корректное число");
            scanner.next();     //рекурсия
            num = getRuble();
        }
        return num;
    }

    public static BigDecimal calc(double curs, double ruble) {     //метод, считывающий с консоли целое число
        BigDecimal dollar = new BigDecimal(ruble / curs);
        dollar = dollar.setScale(2, RoundingMode.DOWN);
        return dollar;
    }
}
