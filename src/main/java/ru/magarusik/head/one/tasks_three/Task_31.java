package ru.magarusik.head.one.tasks_three;

public class Task_31 {
    /*
    Напишите программу RelativelyPrime, которая получает целое число n
    как аргумент командной строки и выводит таблицу n * n, в которой в
    строке i и столбце j выводится *, если НОД i и j равен 1
    (i и j — взаимно простые числа), или пробел в противном случае.
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ":\t|");
            for (int j = 1; j <= n; j++) {
                System.out.print(greatestCommonDivisor(i, j) == 1 ? "*" : " ");
            }
            System.out.println("|");
        }
    }

    public static int greatestCommonDivisor(int x, int y) {
        return x >= y && x % y == 0 ? y : greatestCommonDivisor(y, x % y);
    }
}
