package ru.magarusik.head.one.tasks_two;

public class Task_15 {
    /*
    Напишите программу, которая получает три положительных числа в
    аргументах командной строки и выводит false, если одно из них
    больше или равно сумме других, или true в противном случае.
    (Примечание: программа проверяет, могут ли числа представлять
    длины сторон некоторого треугольника).
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(!(a >= b + c || b >= a + c || c >= a + b));
    }
}
