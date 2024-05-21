package ru.magarusik.head.one.tasks_three;

public class Task9 {
    /*
    Напишите программу с одним циклом for и одной командой if,
    которая выводит целые числа от 1000 до 2000, по 5 чисел на
    строку. Подсказка: используйте оператор %
     */
    public static void main(String[] args) {
        for (int i = 1000; i < 2000; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
        }
    }
}
