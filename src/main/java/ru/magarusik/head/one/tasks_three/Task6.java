package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task6 {
    /*
     Усовершенствуйте свое решение упражнения 1.2.25: добавьте код, который
     проверяет, что значения аргументов командной строки лежат в диапазонах
     допустимых значений формулы, а также код для вывода сообщения об ошибке
     при нарушении ограничений.
     */
    public static void main(String[] args) {
        double temperature = Utils.SCANNER.nextDouble();
        double velocity = Utils.SCANNER.nextDouble();

        if (temperature > 50 || velocity > 120 || velocity < 3) {
            System.out.println("Введены некоректные данные!");
            if (temperature > 50) {
                System.out.println("Температура выше 50!");
            }
            if (velocity > 120 || velocity < 3) {
                System.out.println("Скорость ветра меньше 3 или больше 120!");
            }
        } else {
            System.out.println(35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16));
        }
    }
}
