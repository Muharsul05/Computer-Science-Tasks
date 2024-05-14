package ru.magarusik.head.one.tasks_two;

public class Task7 {
    /*
    Какой результат выводит каждая из следующих строк кода?
    a. System.out.println(2 + "be");
    b.  System.out.println( 2 + 3 + " be");
    c.  System.out.println((2 + 3) + "be");
    d.  System.out.println("bc" + (2 + 3));
    e.  System.out.println("bc" + 2 + 3);
    Объясните каждый результат.
    */
    public static void main(String[] args) {
        System.out.println(2 + "be");           // 2be: 2 кастится к String и конкатенируется c be
        System.out.println(2 + 3 + "be");       // 5be: 2 и 3 скаладываются и 5 кастится к String и конкатенируется
        System.out.println((2 + 3) + "be");     // 5be: 2 и 3 скаладываются и 5 кастится к String и конкатенируется
        System.out.println("bc" + 2 + 3);       // bc23: 2 кастится к String и конкатенируется с bc
                                                // и тоже самое происходит с 3 т.к. происходит String + int и int -> String
    }
}
