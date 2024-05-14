package ru.magarusik.head.one.tasks_two;

public class Task4 {
    /*
    Предположим, а и b — переменные типа int.
    Упростите следующее выражение: (!(а < Ь) && !(а > Ь))
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println((a > b && a < b) + " -> " + false);
    }
}
