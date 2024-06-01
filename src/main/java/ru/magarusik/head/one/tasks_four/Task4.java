package ru.magarusik.head.one.tasks_four;

import ru.magarusik.head.Utils;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    /*
    Напишите фрагмент кода, который переставляет в обратном порядке значения в
    одномерном строковом массиве. Не создавайте другой массив для хранения
    результатов. Подсказка: воспользуйтесь кодом, приведенным в тексте, для
    перестановки значений двух элементов.
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
