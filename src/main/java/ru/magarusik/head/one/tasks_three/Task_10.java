package ru.magarusik.head.one.tasks_three;

public class Task_10 {
    /*
    Напишите программу, которая получает целое число n как аргумент командной строки,
    использует Math.random() для вывода п случайных значений с равномерным распределением
    в интервале от 0 до 1, после чего выводит их среднее значение (см. упражнение 1.2.30).
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double num = Math.random();
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + sum / n);
    }
}
