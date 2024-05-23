package ru.magarusik.head.one.tasks_three;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        var map = new HashMap<>(Map.of(
                "Север", 0,
                "Юг", 0,
                "Восток", 0,
                "Запад", 0
        ));
        var random = new Random();

        while (Math.abs(x) < 2 * n || Math.abs(y) < 2 * n) {
            int randoNumber = random.nextInt(4);
            switch (randoNumber) {
                case 0 -> {
                    y++;
                    map.put("Север", map.get("Север") + 1);
                }
                case 1 -> {
                    y--;
                    map.put("Юг", map.get("Юг") + 1);
                }
                case 2 -> {
                    x++;
                    map.put("Восток", map.get("Восток") + 1);
                }
                case 3 -> {
                    x--;
                    map.put("Запад", map.get("Запад") + 1);
                }
                default -> throw new IllegalStateException("Unexpected value: " + randoNumber);
            }
        }

        System.out.println("Ходов сделано: " + map.values().stream()
                .reduce(0, Integer::sum));
        System.out.println("Статистика: " + map);
    }
}
