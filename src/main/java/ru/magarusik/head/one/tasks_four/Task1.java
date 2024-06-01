package ru.magarusik.head.one.tasks_four;

public class Task1 {
    /*
        Напишите программу, которая объявляет, создает и инициализирует массив а[] длины
        1000 и обращается к элементу а[1000]. Компилируется ли ваша программа?
        Что происходит при ее запуске?
    */

    public static void main(String[] args) {
        System.out.println("Код компилируется но при запуске вызовет исключение:");
        System.out.println("""
                Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
                at ru.magarusik.head.one.tasks_three.Task_44.main(Task_44.java:13)""");
    }
}
