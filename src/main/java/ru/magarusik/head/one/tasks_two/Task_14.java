package ru.magarusik.head.one.tasks_two;

public class Task_14 {
    /*
    Напишите программу, которая получает два положительных числа в аргументах
    командной строки и выводит true, если одно из этих чисел нацело делится на другое
     */

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a % b == 0 || b % a == 0);
    }
}
