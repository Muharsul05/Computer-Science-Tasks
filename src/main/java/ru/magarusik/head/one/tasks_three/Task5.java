package ru.magarusik.head.one.tasks_three;

import java.util.Random;

public class Task5 {
    /*
    Напишите программу RollDice, которая моделирует результат броска
    «смещенного» игрального кубика. Грани 1,2,3,4 и 5 выпадают с вероятностью 1/8,
    а грань 6 — с вероятностью 3/8.
     */
    public static void main(String[] args) {
        var dice = new Random();
        int roll = dice.nextInt(1, 8 + 1);
        switch (roll) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            case 6, 7, 8 -> System.out.println("6");
        }
    }
}
