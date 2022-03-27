package com.max.idea.JavaBasicIBS;

public class Array {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Сумма чисел масива: " + total);
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Наибольший элемент: " + max);

        int[] array1 = {1};
        System.out.println(array1.length);
    }
}
