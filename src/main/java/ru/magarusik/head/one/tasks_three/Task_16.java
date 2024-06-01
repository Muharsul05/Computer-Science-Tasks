package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task_16 {
    /*
    Напишите программу, которая получает целое число n как аргумент командной
    строки и выводит все положительные степени 2, меньшие или равные n.Убедитесь
    в том, что ваша программа правильно работает для всех значений n.
     */
    public static void main(String[] args) {
        int n = Utils.SCANNER.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(i + ":" + Math.pow(2, i));
        }
    }
}
