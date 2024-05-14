package ru.magarusik.head.one.tasks_two;

public class Task_28 {
    /*
    Проверка упорядоченности. Напишите программу, которая получает три
    числа типа double х, у и z в аргументах командной строки и выводит true, если
    значения расположены строго по возрастанию или убыванию (х < у < z или
    х > у > z ), или false в противном случае.
     */
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        System.out.println(x < y && y < z || x > y && y > z);
    }
}
