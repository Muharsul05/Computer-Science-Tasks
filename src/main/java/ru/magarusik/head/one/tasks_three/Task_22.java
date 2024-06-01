package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task_22 {
    /*
    Напишите фрагмент кода, который переводит двоичное представление
    положительного целого числа n в переменную s типа String.
     */

    public static void main(String[] args) {
        int n = Utils.SCANNER.nextInt();
        String s = Integer.toBinaryString(n);
        System.out.println(s);
    }
}
