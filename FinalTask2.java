package com.max.idea.JavaBasicIBS;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите уравнение (x вводим на ангийской раскладке): ");
        String array = scanner.nextLine();      //переменная, будет хранить уравнение

        char[] equation = array.toCharArray();  //разобьем каждый символ введенного уравнения на элемент
        int x = array.indexOf("x");     //вернем индекс переменной куда записан х

        int result = 0;
        int y = Character.getNumericValue(equation[0]);     //перменные, хранят в себе либо введеные числа, либо сам x
        int z = Character.getNumericValue(equation[2]);     //перменные, хранят в себе либо введеные числа, либо сам x
        int c = Character.getNumericValue(equation[4]);     //перменные, хранят в себе либо введеные числа, либо сам x

        String plus = "+";
        String  minus = "-";

        if (equation.length == 5) {     //проверка на длину строчки
            if (array.indexOf("+") == 1) {      //возвращаем идекс элемента "+" и сравниваем с 1 (так как по условию знак + или - могут быть только там)
                switch (x) {
                    case 0:
                        result = c - z;
                        break;
                    case 2:
                        result = c - y;
                        break;
                    case 4:
                        result = y + z;
                        break;
                }
                System.out.println("Результат: " + result);
            } else if (array.indexOf("-") == 1) {       ////возвращаем идекс элемента "-" и сравниваем с 1 (так как по условию знак + или - могут быть только там)
                switch (x) {
                    case (0):
                        result = c + z;
                        break;
                    case (2):
                        result = y - c;
                        break;
                    case (4):
                        result = y - z;
                        break;
                }
                System.out.println("Результат: " + result);
            } else {
                System.out.println("Неккоректный математический знак");
            }
        } else {
            System.out.println("Количество символов в уравнении не должно превышать допустимого значения: 5");
        }
    }
}
