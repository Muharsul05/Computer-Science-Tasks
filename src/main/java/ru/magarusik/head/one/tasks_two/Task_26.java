package ru.magarusik.head.one.tasks_two;

public class Task_26 {
    /*
    Полярные координаты. Напишите программу, которая преобразует
    декартовы координаты в полярные. Ваша программа должна получать
    два числа типа double в аргументах командной строки и выводить
    полярные координаты r и 0. Используйте метод Math.atan2(y, х)
    для вычисления арктангенса величины у/х в диапазоне от -pi до pi.
     */

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(x * x + y * y);
        double angle = x != 0 ? Math.atan2(y, x) : Math.PI / 2 * (y > 0 ? 1 : -1);

        System.out.println(r);
        System.out.println(angle);
    }
}
