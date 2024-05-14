package ru.magarusik.head.one.tasks_two;

public class Task1 {
    /*
        Предположим, а и b — переменные типа int. Что делает следующая последовательность команд?
        int t = a ; b = t ; а = b;
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int t = a;
        b = t;
        a = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println("b = a");
    }
}
