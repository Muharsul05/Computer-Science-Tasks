package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_18 {
    /*
    Напишите программу, которая получает два числа с плавающей точкой х и у
    в аргументах командной строки и выводит евклидово расстояние от точки (х, у)
    до точки (0,0).
     */
    public static void main(String[] args) {
        double y = Utils.SCANNER.nextDouble();
        double x = Utils.SCANNER.nextDouble();
        System.out.println(Math.sqrt(x * x + y * y));
    }
}
