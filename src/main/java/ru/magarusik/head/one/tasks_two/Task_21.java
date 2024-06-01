package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_21 {
    /*
    Напишите программу, которая получает число t в аргументе командной
    строки и выводит значение sin(2t) + sin(3t)
     */
    public static void main(String[] args) {
        double t = Utils.SCANNER.nextDouble();
        System.out.println(Math.sin(2 * t) + Math.sin(3 * t));
    }
}
