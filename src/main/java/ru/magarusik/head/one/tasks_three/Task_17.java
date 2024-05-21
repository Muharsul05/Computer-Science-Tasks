package ru.magarusik.head.one.tasks_three;

public class Task_17 {
    /*
    Доработайте свое решение упражнения 1.2.24, чтобы программа выводила
    общую накопленную сумму и текущие проценты после каждого ежемесячного
    перерасчета суммы вклада.
     */

    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]) / 12;
        double t = Double.parseDouble(args[2]);
        for (int i = 1; i <= t; i++) {
            var temp = P;
            P += P * r;
            System.out.println("\nМесяц: " + i + ":");
            System.out.println("Общая сумма: " + P);
            System.out.println("Проценты: " + (P - temp));
        }
    }
}