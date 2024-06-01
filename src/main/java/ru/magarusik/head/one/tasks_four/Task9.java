package ru.magarusik.head.one.tasks_four;

import java.util.Arrays;

public class Task9 {
    /*
    Какой результат выведет следующий фрагмент кода?

     a == b == false
     */

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};

        System.out.println(a == b); // false

        System.out.println(a.equals(b)); // false

        System.out.println(Arrays.equals(a,b)); // true
    }
}
