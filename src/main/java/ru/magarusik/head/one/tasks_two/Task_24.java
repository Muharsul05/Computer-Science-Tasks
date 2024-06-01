package ru.magarusik.head.one.tasks_two;

import ru.magarusik.head.Utils;

public class Task_24 {
    /*
    Капитализация процентов. Напишите программу, которая вычисляет и
    выводит сумму, которую вы получите через t лет при размещении Р
    долларов под ежегодный процент r (непрерывно начисляемый). Искомое
    значение вычисляется по формуле Ре ^ rt.
     */
    public static void main(String[] args) {
        double P = Utils.SCANNER.nextDouble();
        double r = Utils.SCANNER.nextDouble();
        double t = Utils.SCANNER.nextDouble();
        System.out.println(P * Math.pow(Math.E, r * t));
    }
}
