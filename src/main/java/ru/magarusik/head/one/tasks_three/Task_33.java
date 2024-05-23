package ru.magarusik.head.one.tasks_three;

public class Task_33 {
    /*
    Напишите программу для вывода координат случайной точки (а, Ь, с) на поверхности сферы.
    Для генерирования точек используйте метод Марсальи: начните с выбора случайной точки
    (x, у) на единичном круге (способ описан в конце раздела), затем присвойте
    а - значение 2x * sqrt(1 - x^2 - y^2),
    b — значение 2 * sqrt(1 - x^2 - y^2),
    с — значение 1 - 2 (х^2 + у^2).
     */

    public static void main(String[] args) {
        double x = 0;
        double y = 0;

        do {
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x * x + y * y > 1.0);

        double sqrt = Math.sqrt(1 - Math.pow(x, 2) - Math.pow(y, 2));
        double a = 2 * x * sqrt;
        double b = 2 * sqrt;
        double c = 1 - 2 * (Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println(x + " " + y);
        System.out.println(a + " " + b + " " + c);
    }
}
