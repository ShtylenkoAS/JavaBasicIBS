package com.max.idea.JavaBasicIBS;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = false;
        boolean help = false;
        String answer = null;
        System.out.println("Попробуй отгадать: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("Попытка номер: " + (i + 1));

            if (i==0) {
                System.out.println("(Есть подсказка)");
            }
            answer = scanner.nextLine();
            switch (answer) {
                case ("Заархивированный вирус"):
                    System.out.println("Правильно!");
                    check = true;
                    break;
                default:
                    if (help) {
                        check = true;
                        System.out.println("Обидно! Приходи в другой раз");
                        break;
                    }
                    else if (answer.equals("Подсказка") && i == 0) {
                        System.out.println("Вредоносное ПО, которое спряталось в архиве");
                        help = true;
                        break;
                    }
                    else if (answer.equals("Подсказка") && i > 0) {
                        System.out.println("Увы, подсказка уже недоступна");
                    }
                    else if (i < 2) {
                        System.out.println("Попробуй еще");
                    }
                    else {
                        System.out.println("Обидно! Приходи в другой раз");
                    }
            }
            if (check){
                break;
            }
        }
    }
}