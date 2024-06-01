package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_31 {
    /*
    Проекция Меркатора. Проекция Меркатора представляет собой равноугольную
    (сохраняющую углы между направлениями) картографическую проекцию,отображающую
    широту ф и долготу L в прямоугольные координаты (х, у).Проекция Меркатора
    широко применяется — например, в навигационных картах и тех картах, которые
    вы распечатываете из Интернета. Проекция определяется формулами:
        х = L - L0
        у = 1/2 ln ((1 + sin ф) / (1 - sin ф))
        , где L0 — долгота точки в центре карты.
        Напишите программу, которая получает в командной строке L0,
        а также широту и долготу точки и выводит проекцию точки.
     */
    public static void main(String[] args) {
        double l0 = Utils.SCANNER.nextDouble();
        double phi = Utils.SCANNER.nextDouble();
        double l = Utils.SCANNER.nextDouble();
        double x = l - l0;
        double y = 0.5 * Math.log((1 + Math.sin(phi)) / (1 - Math.sin(phi)));
        System.out.println(x);
        System.out.println(y);
    }
}
