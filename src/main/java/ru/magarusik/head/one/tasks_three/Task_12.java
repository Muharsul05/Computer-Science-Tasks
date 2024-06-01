package ru.magarusik.head.one.tasks_three;

public class Task_12 {
    /*
    Напишите программу FunctionGrowth для вывода таблицы значений:
    n, log(n), n log(n), n^2, n^3, 2^n для n = 16, 32, 64,..., 2048.
    Используйте символы табуляции (символы \ t ) для выравнивания столбцов.
     */
    public static void main(String[] args) {
        int n = 16;
        for (int i = 0; i < 10; i++, n *= 2) {
            System.out.println(n +
                               "\t" + Math.log(n) +
                               "\t" + n * Math.log(n) +
                               "\t" + Math.pow(n, 2) +
                               "\t" + Math.pow(n, 3) +
                               "\t" + Math.pow(2, n));
        }
    }
}
