package com.max.idea.JavaBasicIBS;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] myList = {1, 4, 7, 10, 13, 16};   //создание масссива из 5 элементов
        System.out.println("Изначальный массив: " + Arrays.toString(myList));   //вывод в консоль изначального массива
        int x = myList[0];  //присваиваю переменной первое значение в массиве
        myList[0] = myList[myList.length - 1];  //в первое значение массива подставляю последний элемент массива
        myList[myList.length - 1] = x;  //присваиваю последнему элементу массива первое значение массива (строчка 8)
        System.out.println("Массив, в котором первый и последний элемент поменялись местами" + Arrays.toString(myList));    //вывожу в консоль "перевернутый" массив

        int median = myList[myList.length - 3]; //присваиваю переменной средний элемент в массиве
        //вывод в консоль
        System.out.println("Сумма первого и среднего элемента в изначальном массиве: " + (myList[myList.length - 1] + median));
        System.out.println("Сумма первого и среднего элемента в измененном массиве: " + (myList[0] + median));
    }
}
