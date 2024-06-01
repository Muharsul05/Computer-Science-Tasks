package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task_35 {
    /*
    Контрольная сумма. Код ISBN (International Standard Book Number) представляет собой код из 10 цифр,
    который однозначно определяет книгу. Последняя цифра образует контрольную сумму и однозначно
    вычисляется по 9 другим цифрам из условия, согласно которому значение dx + 2d2 + 3d3 + ... + 10d10
    должно быть кратно 11 (здесь d — i-я цифра справа). Контрольная цифра dx может иметь любое значение
    от 0 до 10. По правилам ISBN для обозначения 10 используется символ 'X'. Например, контрольная цифра
    для последовательности 020131452 равна 5, потому что 5 — единственное значение х от 0 до 10, для которого:
        10 * 0 + 9 * 2 + 8 * 0 + 7 * 1 + 6 * 3 + 5 * 1 + 4 * 4 + 3 * 5 + 2 * 2 + 1 * х
    кратно 11. Напишите программу, которая получает в аргументе командной строки целое число из 9 цифр,
    вычисляет контрольную сумму и выводит код ISBN.
     */

    public static void main(String[] args) {
        String isbn = Utils.SCANNER.next();
        int sum = 0;
        int index = 10;
        for (char c : isbn.toCharArray()) {
            sum += index * Integer.parseInt(String.valueOf(c));
            index--;
        }

        for (int i = 0; i < 10; i++) {
            if ((sum + i) % 11 == 0) {
                System.out.println(i);
            }
        }
    }

}
