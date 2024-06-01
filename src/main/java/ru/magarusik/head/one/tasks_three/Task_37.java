package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

import java.util.EnumMap;
import java.util.Map;
import java.util.Random;

import static ru.magarusik.head.one.tasks_three.Direction.*;

public class Task_37 {
    /*
    Случайное блуждание на плоскости. Случайное блуждание моделирует поведение частицы,
    двигающейся по сетке из точек. На каждом шаге блуждающая частица выбирает перемещение
    на север, на юг, на восток или на запад с вероятностью 1/4 независимо от предыдущих
    перемещений. Напишите программу RandoirtWalker, которая получает целое число n в
    аргументе командной строки и оценивает, сколько перемещений потребуется для достижения
    границы квадрата 2n * 2n с центром в начальной точке
     */

    public static void main(String[] args) {
        int n = Utils.SCANNER.nextInt();
        int x = 0;
        int y = 0;
        var map = new EnumMap<>(Map.of(
                NORTH, 0,
                SOUTH, 0,
                EAST, 0,
                WEST, 0
        ));
        var random = new Random();

        while (Math.abs(x) < 2 * n || Math.abs(y) < 2 * n) {
            int randoNumber = random.nextInt(4);
            switch (randoNumber) {
                case 0 -> {
                    y++;
                    map.put(NORTH, map.get(NORTH) + 1);
                }
                case 1 -> {
                    y--;
                    map.put(SOUTH, map.get(SOUTH) + 1);
                }
                case 2 -> {
                    x++;
                    map.put(EAST, map.get(EAST) + 1);
                }
                case 3 -> {
                    x--;
                    map.put(WEST, map.get(WEST) + 1);
                }
                default -> throw new IllegalStateException("Unexpected value: " + randoNumber);
            }
        }

        System.out.println("Ходов сделано: " + map.values().stream()
                .reduce(0, Integer::sum));
        System.out.println("Статистика: " + map);
    }
}

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}
