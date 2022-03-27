package com.max.idea.JavaBasicIBS;

import  java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //введем объект scanner, который будет читать вводимые данные с консоли

        System.out.println("Введите число x: ");    //сообщение для удобовосприятия
        double x = in.nextDouble(); //вводим число х

        System.out.println("Введите число y: ");    //сообщение для удобовосприятия
        double y = in.nextDouble(); //вводим число у

        System.out.println("Введите число z: ");    //сообщение для удобовосприятия
        double z = in.nextDouble(); //вводим число z

        double median = (x + y + z) / 3;    //получаем среднеарифметическое введеных чисел

        int devision_median = ((int) median) / 2;  //получаем деление среднеарифметического на 2, а также округляем его в меньшую сторону (с посощью перевода типа данных из double в int)

        System.out.println("Среднее арифметическое введеных чисел: " + median);
        System.out.println("Среднее арифметическое введеных чисел поделенное на 2: " + devision_median);

        if (devision_median > 3) {
            System.out.println("Программа работает корректно");
        }
    }
}
