package ru.magarusik.head.one.tasks_three;

public class Task_13 {
    /*
    Какие значения принимают переменные m и n после выполнения следующего кода?
    int n = 123456789;
    int m = 0;
    while (n != 0 ) {                   //  1. n = 123456789    2. n = 12345678    3. n = 1234567   ... 9. n = 0
        m = (10 * m) + (n % 10);        //  1. m = 9            2. m = 98          3. m = 987       ... 9. m = 987654321
        n = n / 10;                     //  1. n = 12345678     2. n = 1234567     3. n = 123456    ... 9.
    }
     */
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m);
        System.out.println(n);
    }
}
