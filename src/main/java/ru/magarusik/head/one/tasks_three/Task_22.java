package ru.magarusik.head.one.tasks_three;

public class Task_22 {
    /*
    Напишите фрагмент кода, который переводит двоичное представление
    положительного целого числа n в переменную s типа String.
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = Integer.toBinaryString(n);
        System.out.println(s);
    }
}
