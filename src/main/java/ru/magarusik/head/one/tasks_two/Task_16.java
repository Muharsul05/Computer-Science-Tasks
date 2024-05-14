package ru.magarusik.head.one.tasks_two;

public class Task_16 {
    /*
    Студент-физик получает неожиданные результаты при использовании кода
    double force = G * massl * mass2 / r * r ;
    для вычисления значений по формуле F = G * m1 * m2 / r ^ 2.
    Объясните суть проблемы и исправьте ошибку
    */
    public static void main(String[] args) {
        double G = 10;
        double mass1 = 10;
        double mass2 = 5;
        double r = 5;
        System.out.println(G * mass1 * mass2 / r * r);          // на результат деления умножается радиус
        System.out.println((G * mass1 * mass2) / (r * r));      // Одно из решений  добавить скобки
        System.out.println(G * mass1 * mass2 / Math.pow(r, 2)); // Возвести радиус в квадрат и делить
    }
}
