package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task1 {
    /*
    Напишите программу, которая получает три целых числа как аргументы
    командной строки и выводит сообщение "equal", если все три числа равны,
    или "not equal" в противном случае.
     */
    public static void main(String[] args) {
        int a = Utils.SCANNER.nextInt();
        int b = Utils.SCANNER.nextInt();
        int c = Utils.SCANNER.nextInt();
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
