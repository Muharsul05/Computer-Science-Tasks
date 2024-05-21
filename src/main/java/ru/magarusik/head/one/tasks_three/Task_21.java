package ru.magarusik.head.one.tasks_three;

public class Task_21 {
    /*
    На основе программы Binary создайте программу Kary, которая получает
    два целых числа i и k в аргументах командной строки и преобразует i в систему
    счисления с основанием k. Предполагается, что i — целое число с типом данных
    Java long, а к — целое число в диапазоне от 2 до 16. В системах счисления с
    основанием больше 10 для представления цифр, соответствующих десятичным значениям
    с 111 до 16, используйте буквы A-F.
     */

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            result.append(switch (n % k) {
                case 0 -> "0";
                case 1 -> "1";
                case 2 -> "2";
                case 3 -> "3";
                case 4 -> "4";
                case 5 -> "5";
                case 6 -> "6";
                case 7 -> "7";
                case 8 -> "8";
                case 9 -> "9";
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> "Error";
            });
            n /= k;
        }
        System.out.println(result.reverse());
    }
}
