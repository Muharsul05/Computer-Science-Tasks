package ru.magarusik.head.one.tasks_four;

import java.util.Random;

public class Task6 {
    /*
    Напишите фрагмент кода для вывода содержимого двумерного массива
    boolean. В выходных данных символ * должен представлять true, а
    пробел — false. Включите индексы строк и столбцов.
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] array = new boolean[n][n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextBoolean();
            }
        }

        for (boolean[] booleans : array) {
            for (boolean aBoolean : booleans) {
                System.out.print(aBoolean ? "*" : " ");
            }
            System.out.println();
        }
    }
}