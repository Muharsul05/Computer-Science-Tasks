package ru.magarusik.head.one.tasks_two;

public class Task_10 {
    /*
    Допустим, переменная а объявляется командой int а = 2_147_483_647 (Integer.MAX_VALUE).
    Какой результат выводит каждая из следующих команд?
    a. System.out.println(a);
    b. System.out.println(a + 1);
    c. System.out.println(2 - a);
    d. System.out.println(- 2 - a);
    e. System.out.println(2 * a) ;
    f. System.out.println(4 * a) ;
     */
    public static void main(String[] args) {
        int a = 0x7fffffff;
        System.out.println(a); // 0x7fffffff
        System.out.println(a + 1);  // 0x7fffffff + 1 = 0x80000000 из-за переполнения
        System.out.println(2 - a); // (0x7fffffff - 2) * -1 -> 0x7ffffffd  * (-1) = 0x80000003
        System.out.println(-2 - a); // - Integer.MAX_VALUE - 2
        System.out.println(2 * a); // -2 Работают как побитовые операции сдвига
        System.out.println(4 * a); // -4
    }
}
