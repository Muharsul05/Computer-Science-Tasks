package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_34 {
    /*
    Сортировка троек. Напишите программу, которая получает в аргументах
    командной строки три целочисленных значения и выводит их упорядоченными по
    возрастанию. Используйте методы Math.min() и Math.max().
     */

    public static void main(String[] args) {
        int a = Utils.SCANNER.nextInt();
        int b = Utils.SCANNER.nextInt();
        int c = Utils.SCANNER.nextInt();
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int middle = a + b + c - min - max;
        System.out.println(min + " " + middle + " " + max);
    }
}
