package ru.magarusik.head.one.tasks_four;

import java.util.Arrays;

public class Task7 {
    /*
    Какой результат выводит следующий фрагмент кода?

    a = {0, 1, 2, 3, 4, 4, 3, 2, 1, 0}
     */

    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {  // a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}
            a[i] = 9 - i;
        }

        for (int i = 0; i < 10; i++) {  // a = {0, 1, 2, 3, 4, 4, 3, 2, 1, 0}
            a[i] = a[a[i]];
        }

        System.out.println(Arrays.toString(a));
    }
}
