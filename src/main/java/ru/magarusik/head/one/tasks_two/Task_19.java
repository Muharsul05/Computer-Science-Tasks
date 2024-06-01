package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

import java.util.Random;

public class Task_19 {
    /*
    Напишите программу, которая получает два целых числа а и b в аргументах
    командной строки и выводит случайное целое число из диапазона от а до b
    включительно.
     */
    public static void main(String[] args) {
        int a = Utils.SCANNER.nextInt();
        int b = Utils.SCANNER.nextInt();
        var random = new Random();
        System.out.println(random.nextInt(a, b));
    }
}
