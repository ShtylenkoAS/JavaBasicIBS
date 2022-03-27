package com.max.idea.JavaBasicIBS;

import  java.util.Scanner;

public class Task5 {
    static Scanner scanner = new Scanner(System.in);    //введем объект scanner, который будет читать вводимые данные с консоли

    public static void main(String[] args) {    //метод, который считывает введенные числа и операцию над ними + возвращает результат
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);
    }

    public static int getInt(){     //метод, считывающий с консоли целое число
        System.out.println("Введите число: ");
        int num;
        if(scanner.hasNextInt()){   //проверка на то, что ввели число типа int
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа, введите корректное число");
            scanner.next();     //рекурсия (зацикл пока не введем int)
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){      //метод, считывающий допустимую операцию калькулятора
        System.out.println("Введите операцию: ");
        char operation;
        if(scanner.hasNext()){      //проверка на допустимый символ операции
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции, введите допустимую операцию");
            scanner.next();     //рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){     //сам калькулятор
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка при вводе операции, введите допустимую операцию");
                result = calc(num1, num2, getOperation());      //рекурсия
        }
        return result;
    }
}