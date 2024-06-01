package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_25 {
    /*
    Охлаждение под действием ветра. Для заданной температуры Т (по шкале
    Фаренгейта) и скорости ветра v (в милях в час) Национальная метеорологическая
    служба вычисляет фактическую температуру (охлаждение под действием ветра)
    по формуле:

    w = 35.74 + 0.6215T + (0.4275Т — 35.75) v ^ 0.16.

    Напишите программу, которая получает два числа типа double temperature
    и velocity в аргументах командной строки и выводит величину охлаждения. Для
    вычисления ab используйте Math. pow(a, b). Примечание: формула недействительна,
    если абсолютное значение Т больше 50 или если v больше 120 или меньше 3
    (предполагается, что полученные значения лежат в этом диапазоне).
     */

    public static void main(String[] args) {
        double temperature = Utils.SCANNER.nextDouble();
        double velocity = Utils.SCANNER.nextDouble();

        System.out.println(35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16));
    }
}
