package ru.magarusik.head.one.tasks_two;

public class Task_11 {
    /*
    Предположим, переменная а объявляется командой d o u b le а = 3 .1 4 1 5 9 .
    Какой результат выводит каждая из следующих команд?
    a. System.out.println(a);
    b. System.out.println(a + 1);
    c. System.out.println(8 / (int) a);
    d. System.out.println(8 / a);
    e. System.out.println((int) (8 / a));
     */
    public static void main(String[] args) {
        double a = 3.14159;
        System.out.println(a);              // 3.14159  - В этом примере выводится число как есть
        System.out.println(a + 1);          // 4.14159  - Тут к числу прибавляется 1 и выводится как есть
        System.out.println(8 / (int) a);    // 2        - Тут к число конвертируется в целое число и делится на 8
        System.out.println(8 / a);          // 2.546    - Тут обычное деление чисел
        System.out.println((int) (8 / a));  // 2        - Тут обычное деление и результат конвертируется к целому числу
    }
}
