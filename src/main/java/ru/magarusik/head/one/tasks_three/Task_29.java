package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task_29 {
    /*
    Напишите программу Checkerboard, которая получает целое число n как
    аргумент командной строки и использует вложенные циклы для вывода
    двумерного узора «шахматной доски» из чередующихся пробелов и звездочек
     */

    public static void main(String[] args) {
        int n = Utils.SCANNER.nextInt();
        String board = "+" + "-".repeat(n) + "+";
        System.out.println(board);
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        System.out.println(board);
    }
}
