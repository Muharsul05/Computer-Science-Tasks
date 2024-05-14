package ru.magarusik.head.one.tasks_two;

public class Task_27 {
    /*
    Случайные числа с гауссовским (нормальным) распределением.
    Напишите программу Random Gaussian для вывода случайного
    числа r из гауссовского распределения. Для этого можно
    воспользоваться формулой Бокса — Мюллера:
        r = sin(2 pi v) (-2 ln u) ^ 1/2
    где u и v — вещественные числа в диапазоне от 0 до 1,
    сгенерированные методом Math.random().
     */

    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();
        System.out.println(Math.sin(2 * Math.PI * v) * Math.pow(-2 * Math.log(u), 0.5));
    }
}
