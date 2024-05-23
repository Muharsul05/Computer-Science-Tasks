package ru.magarusik.head.one.tasks_three;

public class Task_23 {
    /*
    Напишите версию программы Gambler, использующую два вложенных цикла
    while или два вложенных цикла for (вместо цикла while в цикле for).
     */

    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trails = Integer.parseInt(args[2]);

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
