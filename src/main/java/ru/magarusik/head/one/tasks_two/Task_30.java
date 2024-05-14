package ru.magarusik.head.one.tasks_two;

public class Task_30 {
    /*
    Случайные числа с равномерным распределением. Напишите программу,
    которая выводит пять случайных чисел с равномерным распределением
    в диапазоне от 0 до 1, их среднее арифметическое, минимальное и
    максимальное значения. Используйте методы Math.random(), Math.min() и Math.max()
     */

    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        System.out.println("Max: " + Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));
        System.out.println("Min: " + Math.min(a, Math.min(b, Math.min(c, Math.min(d, e)))));
        System.out.println("Avg: " + (a + b + c + d + e) / 5);
    }
}
