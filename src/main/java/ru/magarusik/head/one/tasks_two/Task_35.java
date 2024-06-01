package ru.magarusik.head.one.tasks_two;

public class Task_35 {
    /*
    Кривая дракона. Напишите программу, которая выводит инструкции для
    рисования кривых дракона разного порядка, от 0 до 5. Инструкции выглядят
    как цепочки символов F, L и R, где F означает «нариовать линию на 1
    единицу вперед», L — «повернуть налево», a R — «повернуть направо».
    Чтобы  получить кривую дракона порядка п, сложите  полоску бумаги пополам
    n раз, а затем разверните с прямыми углами. Чтобы решить эту задачу,
    заметим, что кривая порядка n является кривой порядка n - 1, за которой
    следует инструкция L и кривая порядка n - 1, обходимая в обратном порядке
    (далее аналогичное описание строится для обратной кривой).
    0: F
    1: FLF
    2: FLFLFRF
    3. FLFLFRFLFLFRFRF
     */
    public static void main(String[] args) {
        String dragon = "F";
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.println((i + 1) + ": " + dragon);
            dragon = dragon + "L" + inverse(dragon);
        }
    }

    public static String inverse(String dragon) {
        StringBuilder result = new StringBuilder();
        for (int i = dragon.length() - 1; i >= 0; i--) {
            char current = dragon.charAt(i);
            if (current == 'L') {
                result.append('R');
            } else if (current == 'R') {
                result.append('L');
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }
}
