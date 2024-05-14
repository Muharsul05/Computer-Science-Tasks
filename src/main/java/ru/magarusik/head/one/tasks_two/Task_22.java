package ru.magarusik.head.one.tasks_two;

public class Task_22 {
    /*
    Напишите программу, которая получает числа типа double х0, v0 и t
    в аргументах командной строки и выводит значение х0 + v0t - gt^2/ 2,
    где g — константа 9,80665. (Примечание: значение определяет путь в
    метрах, пройденный за t секунд брошенным вертикально вверх объектом,
    из исходной позиции х0 со скоростью v0 метров в секунду.)
     */
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;
        System.out.println(x0 + v0 - g * Math.pow(t, 2) / 2);
    }
}
