package ru.magarusik.head.one.tasks_three;

import java.util.TreeSet;

public class Task_36 {
    /*
    Подсчет простых чисел. Напишите программу PrimeCounter, которая получает целое число n
    как аргумент командной строки и выводит количество простых чисел, меньших или равных n.
    Используйте программу для вывода количества простых чисел, меньших или равных 10 000 000.
    Примечание: если действовать бездумно, ваша программа вряд ли завершится за разумное время!
     */

    public static void main(String[] args) {
        int n = 10_000_000;
        int count = 1;
        var set = new TreeSet<Integer>();
        set.add(2);
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for (var prime : set) {
                if (prime > Math.sqrt(i)) {
                    break;
                }
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                set.add(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
