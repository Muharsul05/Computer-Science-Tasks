package ru.magarusik.head.one.tasks_two;

public class Task_34 {
    /*
    Сортировка троек. Напишите программу, которая получает в аргументах
    командной строки три целочисленных значения и выводит их упорядоченными по
    возрастанию. Используйте методы Math.min() и Math.max().
     */

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int middle = a + b + c - min - max;
        System.out.println(min + " " + middle + " " + max);
    }
}
