package ru.magarusik.head.one.tasks_three;

public class Task_27 {
    /*
    Внесите изменения в программу Factors, чтобы каждый простой множитель
    выводился только в одном экземпляре
     */

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor <= n / factor; factor++) {
            boolean isFirst = true;
            while (n % factor == 0) {
                n /= factor;
                if (isFirst) {
                    isFirst = false;
                    System.out.print(factor + " ");
                }
            }
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
