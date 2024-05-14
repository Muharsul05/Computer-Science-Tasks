package ru.magarusik.head.one.tasks_two;

public class Task_29 {
    /*
    День недели. Напишите программу, которая получает дату и выводит день
    недели, на который приходится эта дата. Ваша программа должна получать три
    значения типа int в аргументах командной строки: m (месяц), d (день) и у (год).
    Значение m равно 1 для января, 2 — для февраля и т. д. Программа выводит 0 для
    воскресенья, 1 — для понедельника, 2 — для вторника и т. д. Вычисление выполняется
    по следующим формулам из григорианского календаря:

    y0 = y - (14 - m) / 12
    х = y0 + y0 / 4  - y0 / 100 + y0 / 400
    m0 = m + 12 * ((14 - m) / 12) - 2
    d0 = (d + x + (31 * m0) / 12) % 7
     */

    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        switch (d0) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 0 -> System.out.println("Sunday");
            default -> System.out.println("Error");
        }
    }
}
