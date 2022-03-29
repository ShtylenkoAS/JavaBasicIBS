package com.max.idea.JavaBasicIBS;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строчку: ");
        String str = scanner.nextLine();

        boolean flag = false;       //переменная для инициализации подсчета слов
        int count = 0;      //переменная для подсчета слов

        String[] array = str.split(" ");        //завожу массив, в который войдут элементы строки разделенные символом табуляции " "

        System.out.println("Вывод слов написанных на латинице: ");

        for (int i = 0; i < array.length; i++) {
            char[] charArray = array[i].toLowerCase().toCharArray();        //завожу массив типа char и упрощаю себе жизнь переводя все в нижний регистр
            for (int j = 0; j < charArray.length; j++) {
                flag = ((int) charArray[j] >= 97 && charArray[j] <= 122);       //на данный промежуток приходятся латинские символы
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println(array[i] + " ");
                count = count + 1;
            }
        }
        System.out.println("Количество слов из латиницы: " + count);
    }
}
