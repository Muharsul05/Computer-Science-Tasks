package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task_32 {
    /*
    Напишите программу PowersOfК, которая получает целое число k как аргумент командной строки
    и выводит все положительные степени к из типа данных Java long. Примечание: наибольшее значение
    типа long задается константой Long.MAX_VALUE
     */

    public static void main(String[] args) {
        int k = Utils.SCANNER.nextInt();
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            var pow = Math.pow(i, k);
            if (pow > Long.MAX_VALUE) {
                break;
            }
            System.out.println(i + ":" + (long) pow);
        }
    }
}
