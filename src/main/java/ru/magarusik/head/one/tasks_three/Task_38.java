package ru.magarusik.head.one.tasks_three;

public class Task_38 {
    /*
    Экспоненциальная функция. Пусть х — положительная переменная типа double.
    Напишите фрагмент кода, использующий разложение в ряд Тейлора для вычисления
    значения sum, равного е^x = 1 + х + х^2/2! + x^3/З! + ...
     */

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        System.out.println("e ^ " + x + " = " + exp(x));
        System.out.println("Math.exp(" + x + ") = " + Math.exp(x));
    }

    public static double exp(double x) {
        double sum = 1 + x;
        double factorial = 1;
        double powX = x;
        for (int i = 2; i <= 200; i++) {
            if (factorial * i == Double.POSITIVE_INFINITY ||
                    powX * x == Double.POSITIVE_INFINITY) {
                break;
            }
            factorial *= i;
            powX *= x;
            sum += powX / factorial;
        }
        return sum;
    }
}
