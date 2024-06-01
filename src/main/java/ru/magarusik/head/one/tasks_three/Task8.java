package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task8 {
    /*
    Перепишите программу TenHellos и создайте программу Hellos, которая получает
    в аргументе командной строки количество повторений. Можно предположить, что
    аргумент меньше 1000. Подсказка: используйте выражения i % 10 и i % 100, чтобы
    определить, какой из суффиксов числительных — st, nd, rd или th — должен
    использоваться при выводе i-ro сообщения "Hello".
     */
    public static void main(String[] args) {
        int n = (Utils.SCANNER.nextInt()) % 1000;
        for (int i = 1; i <= n; i++) {
            if (i == 11 || i == 12 || i == 13) {
                System.out.println(i + "th Hello");
            } else {
                switch (i % 10) {
                    case 1 -> System.out.println(i + "st Hello");
                    case 2 -> System.out.println(i + "nd Hello");
                    case 3 -> System.out.println(i + "rd Hello");
                    default -> System.out.println(i + "th Hello");
                }
            }
        }
    }
}
