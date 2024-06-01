package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task4 {
    /*
    Напишите фрагмент кода, который выводит сообщение "true", если
    переменные х и у типа double лежат строго в диапазоне от 0 до 1,
    или "false" в противном случае.
     */
    public static void main(String[] args) {
        double x = Utils.SCANNER.nextDouble();
        double y = Utils.SCANNER.nextDouble();
        System.out.println(x >= 0.0 && x <= 1.0 && y >= 0.0 && y <= 1.0);
    }
}
