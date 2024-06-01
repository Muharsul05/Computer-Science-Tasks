package ru.magarusik.head.one.tasks_four;

import java.util.Arrays;

public class Task_14 {
    /*
    Напишите фрагмент кода для вывода транспонированного квадратного
    двумерного массива (то есть полученного перестановкой строк и столбцов).
    Для примера таблицы, приведенного в тексте, ваш код должен выводить следующий
    результат:
        99 85 98
        98 57 78
        92 77 76
        94 32 11
        99 34 22                99 98 92 94 99 90 76 92 97 89
        90 46 54        ->      85 57 78 32 34 22 46 77 71 29
        76 59 88                98 78 76 11 22 38 54 76 24 38
        92 66 89
        97 71 24
        89 29 38
     */

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {99, 85, 98},
                {98, 57, 78},
                {92, 77, 76},
                {94, 32, 11},
                {99, 34, 22},
                {90, 46, 54},
                {76, 59, 88},
                {92, 66, 89},
                {97, 71, 24},
                {89, 29, 38}
        };

        int[][] b = transponder(a);

        System.out.println(Arrays.deepToString(b));
    }

    private static int[][] transponder(int[][] array) {
        int[][] trans = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                trans[i][j] = array[j][i];
            }
        }
        return trans;
    }

}
