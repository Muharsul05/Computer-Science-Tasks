package ru.magarusik.head.one.tasks_three;

public class Task7 {
    /*
    Допустим, переменные i и j относятся к типу int. Какое значение принимает
    переменная j после выполнения каждой из следующих команд?
    a. for (i = 0, j = 0; i < 10; i++) j += i;  // j = 0, 1, 3, 6, 10, 15, 21, 28, 36, 45
                                                // i = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    b. for (i = 0, j = 1; i < 10; i++) j += j;  // j = 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
                                                // i = 0, 1, 2,  3,  4,  5,   6,   7,   8,    9
    c. for (j = 0; j < 10; j++) j += j;         // j = 0, 2, 6, 14, 15

    d. for (i = 0, j = 0; i < 10; i++) j += j++ // j = 0
     */

    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 0; i < 10; i++) j += i;
        System.out.println(j);
        for (i = 0, j = 1; i < 10; i++) j += j;
        System.out.println(j);
        for (j = 0; j < 10; j++) j += j;
        System.out.println(j);
        for (i = 0, j = 0; i < 10; i++) j += j++;
        System.out.println(j);
    }
}
