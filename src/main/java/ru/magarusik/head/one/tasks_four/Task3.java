package ru.magarusik.head.one.tasks_four;

import ru.magarusik.head.Utils;

import java.util.Arrays;

public class Task3 {
    /*
    Для двух заданных векторов длины n, представленных одномерными массивами,
    напишите фрагмент кода для вычисления евклидова расстояния между ними
    (квадратный корень из суммы квадратов разностей между соответствующими
    элементами).
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] v1 = new double[n];
        double[] v2 = new double[n];

        for (int i = 0; i < n; i++) {
            v1[i] = Math.random() * 10;
            v2[i] = Math.random() * 10;
        }

        double r = 0;
        for (int i = 0; i < n; i++) {
            r += Math.pow(v1[i] - v2[i], 2);
        }
        r = Math.sqrt(r);

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        System.out.println("" + r);
    }
}
