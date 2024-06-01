package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_33 {
    /*
    Дуга большого круга. Напишите программу GreatCircle, которая получает
    четыре значения типа double x1, y1, х2 и у2 в аргументах командной
    строки (широта и долгота в градусах двух точек земной поверхности) и
    выводит расстояние дуги большого круга между этими точками. Расстояние
    дуги большого круга (в морских милях) задается следующей формулой:

        d = 60 arccos(sin(x1) sin(x2) + cos(x1) cos(x2) cos(y1 - y2)).

    Обратите внимание: в формуле используются градусы, а тригонометрические
    функции Java работают с радианами. Используйте методы Math.toRadians()
    и Math.toDegrees() для преобразования между угловыми единицами.
    Исползуйте свою программу для вычисления расстояния по дуге большого
    круга между Парижем (48,87° N и -2,33° W ) и Сан-Франциско (37,8° N и 122,4° W).
     */
    public static void main(String[] args) {
        double x1 = Math.toRadians(Utils.SCANNER.nextDouble());
        double y1 = Math.toRadians(Utils.SCANNER.nextDouble());
        double x2 = Math.toRadians(Utils.SCANNER.nextDouble());
        double y2 = Math.toRadians(Utils.SCANNER.nextDouble());
        double d = 60 * Math.acos(Math.sin(x1) * Math.sin(x2) +
                                  Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println(d);
    }
}
