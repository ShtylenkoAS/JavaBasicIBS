package com.max.idea.JavaBasicIBS;

import  java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //введем объект scanner, который будет читать вводимые данные с консоли
        System.out.println("Варианты конвертации: 1 - Расстояние, 2 - Масса");
        int choice = scanner.nextInt();
        double var;
        switch (choice){
            case 1:     //пользователь выбрал конвертацию единиц расстояния
                System.out.println("Выберите единицу измерения: 1 - Метры, 2 - Мили, 3 - Ярды, 4 - Футы");
                int dimension = scanner.nextInt();
                System.out.println("Введите число: ");
                var = scanner.nextDouble();
                switch (dimension){
                    case 1:     //вводит метры
                        System.out.println("Метры: " + var);
                        System.out.println("Мили: " + var * 0.000621371);
                        System.out.println("Ярды: " + var * 1.09361);
                        System.out.println("Фут: " + var * 3.28084);
                        break;
                    case 2:     //вводит мили
                        System.out.println("Метры: " + var * 1609.34);
                        System.out.println("Мили: " + var);
                        System.out.println("Ярды: " + var * 1760);
                        System.out.println("Фут: " + var * 5280);
                        break;
                    case 3:     //вводит ярды
                        System.out.println("Метры: " + var * 0.9144);
                        System.out.println("Мили: " + var * 0.000568182);
                        System.out.println("Ярды: " + var);
                        System.out.println("Фут: " + var * 3);
                        break;
                    case 4:     //вводит футы
                        System.out.println("Метры: " + var * 0.3048);
                        System.out.println("Мили: " + var * 0.000189394);
                        System.out.println("Ярды: " + var * 0.333333);
                        System.out.println("Фут: " + var);
                        break;
                }
                break;
            case 2:     //пользователь выбрал конвертацию единиц массы
                System.out.println("Выберите единицу измерения: 1 - Килограммы, 2 - Граммы, 3 - Тонны, 4 - Фунты");
                int weight = scanner.nextInt();
                System.out.println("Введите число: ");
                var = scanner.nextDouble();
                switch (weight) {
                    case 1:     //вводит килограммы
                        System.out.println("Килограммы: " + var);
                        System.out.println("Граммов: " + var * 1000);
                        System.out.println("Тонн: " + var / 1000);
                        System.out.println("Фунтов: " + var * 2.20462);
                        break;
                    case 2:     //вводит граммы
                        System.out.println("Килограммы: " + var * 0.001);
                        System.out.println("Граммов: " + var);
                        System.out.println("Тонн: " + var * 0.000001);
                        System.out.println("Фунтов: " + var * 0.00220462);
                        break;
                    case 3:     //вводит тонны
                        System.out.println("Килограммы: " + var * 1000);
                        System.out.println("Граммов: " + var * 1000000);
                        System.out.println("Тонн: " + var);
                        System.out.println("Фунтов: " + var * 2204.62);
                        break;
                    case 4:     //вводит фунты
                        System.out.println("Килограммы: " + var * 0.453592);
                        System.out.println("Граммов: " + var * 453.592);
                        System.out.println("Тонн: " + var * 0.000453592);
                        System.out.println("Фунтов: " + var);
                        break;
                }
                break;
            default:
                System.out.println("Выберите одно из предложенных значений");
                break;
        }
    }
}