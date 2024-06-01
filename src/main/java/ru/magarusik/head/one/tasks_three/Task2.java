package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task2 {
    /*
    Напишите более универсальную и надежную версию программы Quadratic (листинг 1.2.3),
    которая выводит корни многочлена ах ^ 2 + Ьх + с, либо соответствующее сообщение,
    если дискриминант отрицателен, при этом избегая деления на нуль, если значение
    а равно нулю.
     */
    public static void main(String[] args) {
        double a = Utils.SCANNER.nextInt();
        double b = Utils.SCANNER.nextInt();
        double c = Utils.SCANNER.nextInt();

        if (a != 0) {
            double d = Math.pow(b, 2) - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(x1 + " " + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                System.out.println("Мнимые корни...");
            }
        } else {
            if (b != 0) {
                double x = -c / b;
                System.out.println(x);
            } else {
                System.out.println("Корней не существует...");
            }
        }
    }
}