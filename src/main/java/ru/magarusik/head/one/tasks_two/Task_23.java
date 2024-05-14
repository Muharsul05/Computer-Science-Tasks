package ru.magarusik.head.one.tasks_two;

public class Task_23 {
    /*
    Напишите программу, которая получает два целых числа m и d в аргументах
    командной строки и выводит true, если день d месяца m лежит в диапазоне
    от 20/03 до 20/06, или false в противном случае
     */
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        if (month == 3 && day >= 20 || month == 6 && day <= 20) {
            System.out.println(true);
        } else {
            System.out.println(month >= 4 && month <= 5);
        }
    }
}
