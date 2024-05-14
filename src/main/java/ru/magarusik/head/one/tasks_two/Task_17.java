package ru.magarusik.head.one.tasks_two;

public class Task_17 {
    /*
    Присвойте значение переменной а после выполнения каждой из следующих
    серий команд:
    int a = 1;                  boolean a = true;               int a = 2;
    a = a + a;  // 2            a = !a; // false                a = a * a; // 4
    a = a + a;  // 4            a = !a; // true                 a = a * a; // 16
    a = a + a;  // 8            a = !a; // false                a = a * a; // 256
     */
    public static void main(String[] args) {
        int a = 1;
        a = a + a;  // 2
        System.out.println(a);
        a = a + a;  // 4
        System.out.println(a);
        a = a + a;  // 8
        System.out.println(a);

        boolean b = true;
        b = !b; // false
        System.out.println(b);
        b = !b; // true
        System.out.println(b);
        b = !b; // false
        System.out.println(b);

        int c = 2;
        c = c * c; // 4
        System.out.println(c);
        c = c * c; // 16
        System.out.println(c);
        c = c * c; // 256
        System.out.println(c);
    }
}
