package ru.magarusik.head.one.tasks_four;

import java.util.Arrays;

public class Task_13 {
    /*
    Напишите фрагменты кода для создания двумерного массива Ь[][],
    который является копией существующего двумерного массива a[][]
    при каждом из следующих предположений.

     a. Массив а[][] — квадратный.
     b. Массив а[][] — прямоугольный.
     c. Массив а[][] может быть невыровненным (ступенчатым).
     */

    public static void main(String[] args) {
        int a[][] = new int[][]{
                {1, 2, 3, 2},
                {1, 2, 3, 2},
                {3, 2, 1, 0}
        };

        int[][] b = copy(a);

        System.out.println(Arrays.deepToString(b));
    }

    private static int[][] copy(int[][] src) {
        int[][] dst = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            dst[i] = new int[src[i].length];
            for (int j = 0; j < src[i].length; j++) {
                dst[i][j] = src[i][j];
            }
//            System.arraycopy(src[i], 0, dst[i], 0, src[i].length);
        }
        return dst;
    }
}
