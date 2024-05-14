package ru.magarusik.head.one.tasks_two;

import java.util.Random;

public class Task_20 {
    /*
    Напишите программу, которая выводит сумму двух случайных чисел от 1 до
    6 (такие результаты могут быть получены при броске кубиков).
     */
    public static void main(String[] args) {
        var random = new Random();
        System.out.println(random.nextInt(1, 6) + random.nextInt(1, 6));
    }
}
