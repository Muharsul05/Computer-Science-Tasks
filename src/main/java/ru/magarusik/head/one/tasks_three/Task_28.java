package ru.magarusik.head.one.tasks_three;

public class Task_28 {
    /*
    Экспериментальным путем определите, как влияет использование в программе Factors
    (листинг 1.3.9) условия завершения (factor <= n / factor) вместо (factor < п).
    Для каждого метода найдите наибольшее значение n, с которым при вводе числа из n
    цифр программа гарантированно завершается за 10 секунд.
     */

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor < n; factor++) {
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
    // С оптимизацией (factor <= n / factor) при вводе числа 9223372036854775804 выполнилось за 8 секунд
    // Убрав эту оптимизацию при том же вводе числа 9223372036854775804 не выполнилось даже за минуту
}
