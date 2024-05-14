package ru.magarusik.head.one.tasks_two;

public class Task_24 {
    /*
    Капитализация процентов. Напишите программу, которая вычисляет и
    выводит сумму, которую вы получите через t лет при размещении Р
    долларов под ежегодный процент r (непрерывно начисляемый). Искомое
    значение вычисляется по формуле Ре ^ rt.
     */
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        System.out.println(P * Math.pow(Math.E, r * t));
    }
}
