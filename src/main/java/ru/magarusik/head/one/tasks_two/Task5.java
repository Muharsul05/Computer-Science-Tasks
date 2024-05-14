package ru.magarusik.head.one.tasks_two;

public class Task5 {
    /*
    Оператор исключающего OR ^ для операндов типа boolean по определению
    возвращает true, если операнды различны, и возвращает false, если они совпадают.
    Приведите таблицу истинности для этой функции.
     +---------------+
     | A | B | A ^ B |
     +---------------+
     | 0 | 0 |   0   |
     | 0 | 1 |   1   |
     | 1 | 0 |   1   |
     | 1 | 1 |   0   |
     +---------------+
     */
    public static void main(String[] args) {
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
    }
}
