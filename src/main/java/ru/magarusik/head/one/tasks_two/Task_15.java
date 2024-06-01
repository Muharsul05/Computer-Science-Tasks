package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_15 {
    /*
    Напишите программу, которая получает три положительных числа в
    аргументах командной строки и выводит false, если одно из них
    больше или равно сумме других, или true в противном случае.
    (Примечание: программа проверяет, могут ли числа представлять
    длины сторон некоторого треугольника).
     */
    public static void main(String[] args) {
        int a = Utils.SCANNER.nextInt();
        int b = Utils.SCANNER.nextInt();
        int c = Utils.SCANNER.nextInt();
        System.out.println(!(a >= b + c || b >= a + c || c >= a + b));
    }
}
