package ru.magarusik.head.one.tasks_two;

public class Task9 {
    /*
    Какой результат выводит каждая из следующих команд?
    a. System.out.println('b');
    b. System.out.println('b' + 'c');
    c. System.out.println((char) ('a' + 4 ));
     */
    public static void main(String[] args) {
        System.out.println('b'); // b
        System.out.println((int) 'b'); // 98
        System.out.println('b' + 'c'); // 98 + 99 = 197
        System.out.println((char) ('a' + 4));  // e
    }
}
