package ru.magarusik.head.one.tasks_three;

import ru.magarusik.head.Utils;

public class Task_23 {
    /*
    Напишите версию программы Gambler, использующую два вложенных цикла while или два вложенных цикла for (вместо цикла while в цикле for).
     */

    public static void main(String[] args) {
        int stake = Utils.SCANNER.nextInt();
        int goal = Utils.SCANNER.nextInt();
        int trails = Utils.SCANNER.nextInt();

        int bets = 0;
        int wins = 0;

//        for (int t = 0; t < trails; t++) {
//            int cash = stake;
//
//            for (; cash > 0 && cash < goal; ) {
//                bets++;
//                if (Math.random() < 0.5) cash++;
//                else cash--;
//
//            }
//
//            if (cash == goal) wins++;
//        }

        int t = 0;
        while (t < trails) {
            int cash = stake;

            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;
                else cash--;
            }
            if (cash == goal) wins++;

            t++;
        }

        System.out.println(100 * wins / trails + "% wins");
        System.out.println("Avg bets: " + bets / trails);
    }
}
