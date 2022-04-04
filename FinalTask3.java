package com.max.idea.JavaBasicIBS;

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int num_str = scanner.nextInt();      //вводим количество строк
        scanner.nextLine();     //добавил "ожидание", иначе главный цикл сразу перейдет к i = 2

        int[] result = new int[num_str];      //сохранеям количество совпадений по каждой строке

        String[] list = new String[num_str];     //массив, хранит в себе введеные строки как элементы

        boolean flag;       //флаг совпадения элементов

        int count = 0;      //хранит в себе повторяющиеся символы

        int max = 0;        //хранит количество неповторяющихся символов

        String maxStr = null;       //будущая строка с максимальным количеством уникальных символов

        for (int i = 0; i < num_str; i++) {
            System.out.print("Введите " + (i + 1) + " строку: ");
            String str = scanner.nextLine();
            list[i] = str;
            char[] charStr = str.toCharArray();     //поэлементно разбиваем введеную строку для последющего анализа

            for (int j = 0; j < charStr.length; j++) {      //считаем количесвто повторяющихся элементов
                flag = !(str.substring(j + 1).contains(String.valueOf(charStr[j])));
                if (flag) {
                    ++count;
                }
            }
            result[i] = count;

            count = 0;      //занулим, иначе продолжит подсчет символов

            for (int j : result) {
                if (max < j) {
                    max = j;
                    maxStr = list[i];
                }
            }
        }
        System.out.print("Строка с максимальным количеством различных символов : " + maxStr);
    }
} 