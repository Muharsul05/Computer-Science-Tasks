package ru.magarusik.head.one.tasks_one;

public class Task4 {
    //Опишите, что произойдет, если в программе HelloWorld.java разместить
    // двойные кавычки в команде вывода в разных строках, как в следующем фрагменте:
    //System.out.println("Hello,
    //                      World");
    public static void main(String[] args) {
        System.out.println("Hello, World");

        System.out.println("""
                Вот что произойдёт:
                Task4.java:9: error: unclosed string literal
                        System.out.println("Hello,
                                           ^
                Task4.java:10: error: unclosed string literal
                                World");
                                     ^
                Task4.java:10: error: not a statement
                                World");
                                ^
                3 errors
                error: compilation failed
                """);
    }
}
