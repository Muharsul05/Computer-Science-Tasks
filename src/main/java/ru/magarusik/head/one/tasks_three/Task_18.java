package ru.magarusik.head.one.tasks_three;

public class Task_18 {
    /*
    В отличие от гармонических чисел, сумма 1/1 ^ 2 + 1/2 ^ 2 + ... + 1 /n ^ 2 сходится
    к константе при стремлении п к бесконечности. (Эта константа равна pi ^ 2/ 6, поэтому
    формула может использоваться для вычисления приближенного значения л.) Какой из
    следующих циклов for вычисляет эту сумму? Предполагается, что n — переменная типа int,
    инициализированная значением 1000000, a sum — переменная типа double, инициализированная
    значением 0.0

    a. for (int i = 1; i <= n; i++) sum += 1 / (i * i);         // int
    b. for (int i = 1; i <= n; i++) sum += 1.0 / i * i;         // ()
    c. for (int i = 1; i <= n; i++) sum += 1.0 / (i * i);       // При больших данных n получается бесконечность
    d. for (int i = 1; i <= n; i++) sum += 1 / (1.0 * i * i);   // Магия но это работает было бы лучше использовать Math.pow(i, 2);
     */


    public static void main(String[] args) {
        int n = 1_000_000_000;
        double sum = 0;

//        for (int i = 1; i <= n; i++) sum += 1 / (i * i);
//        System.out.println(sum);
//        sum = 0;
//
//        for (int i = 1; i <= n; i++) sum += 1.0 / i * i;
//        System.out.println(sum);
//        sum = 0;

//        for (int i = 1; i <= n; i++) sum += 1.0 / (i * i);
//        System.out.println(sum);
//        sum = 0;

        for (int i = 1; i <= n; i++) sum += 1 / (1.0 * i * i);
        System.out.println(sum);

        System.out.println(Math.pow(Math.PI, 2) / 6);
    }
}
