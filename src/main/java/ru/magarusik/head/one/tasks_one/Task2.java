package ru.magarusik.head.one.tasks_one;

public class Task2 {
    //  Опишите, что произойдет, если пропустить ключевые слова в программе HelloWorld.java:
    public static void main(String[] args) {
        System.out.println("public: " + "can't find main(String[]) method in class: ru.magarusik.head.one.tasks_one.Task2\n");
        System.out.println("static:" + "error: 'main' method is not declared 'public static'\n");
        System.out.println("void:\n" + """
                Task2.java:5: error: invalid method declaration; return type required
                    public static  main(String[] args) {
                                   ^
                1 error
                error: compilation failed
                """
        );
        System.out.println("args:\n" + """
                Task2.java:5: error: <identifier> expected
                    public static void main(String[] ) {
                                                    ^
                1 error
                error: compilation failed
                """);
    }
}