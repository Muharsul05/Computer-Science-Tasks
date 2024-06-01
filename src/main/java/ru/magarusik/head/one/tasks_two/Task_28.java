package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_28 {
    /*
    Проверка упорядоченности. Напишите программу, которая получает три
    числа типа double х, у и z в аргументах командной строки и выводит true, если
    значения расположены строго по возрастанию или убыванию (х < у < z или
    х > у > z ), или false в противном случае.
     */
    public static void main(String[] args) {
        double x = Utils.SCANNER.nextDouble();
        double y = Utils.SCANNER.nextDouble();
        double z = Utils.SCANNER.nextDouble();
        System.out.println(x < y && y < z || x > y && y > z);
    }
}
