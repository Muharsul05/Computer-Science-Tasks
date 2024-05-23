package ru.magarusik.head.one.tasks_three;

public class Task_30 {
    /*
    Напишите программу GreatestCommonDivisor для нахождения наибольшего общего
    делителя (НОД) двух чисел по алгоритму Евклида. Этот итерационный алгоритм
    основан на следующем наблюдении: если х больше у, то если х делится на у,
    то НОД х и у равен у; в противном случае НОД х и у равен НОД х % у и у.
     */

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println(greatestCommonDivisor(x, y));
    }

    public static int greatestCommonDivisor(int x, int y) {
        return x > y && x % y == 0 ? y : greatestCommonDivisor(y, x % y);
    }
}
