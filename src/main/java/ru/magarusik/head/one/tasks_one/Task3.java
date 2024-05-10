package ru.magarusik.head.one.tasks_one;

public class Task3 {
    // Опишите, что произойдет, если в программе HelloWorld.java
    // совершить опечатку в ключевых словах слове (скажем, пропустить вторую букву):
    public static void main(String[] as) {
        System.out.println("public:\n" + """
                Task3.java:6: error: <identifier> expected
                    pblic static void main(String[] ags) {
                         ^
                1 error
                error: compilation failed
                """);

        System.out.println("static:\n" + """
                Task3.java:6: error: <identifier> expected
                    public satic void main(String[] ags) {
                                ^
                1 error
                error: compilation failed
                """);

        System.out.println("void:\n" + """
                Task3.java:6: error: cannot find symbol
                    public static vid main(String[] ags) {
                                  ^
                  symbol:   class vid
                  location: class Task3
                1 error
                error: compilation failed
                """);
        System.out.println("args: Ничего");
    }
}
