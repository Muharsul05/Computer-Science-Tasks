package ru.magarusik.head.one.tasks_four;

import ru.magarusik.head.Utils;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Так как получается значение при n^4 которое переполняет значение int");
        System.out.println("Код компилируется но при запуске вызовет исключение:");
        System.out.println("""
                Exception in thread "main" java.lang.NegativeArraySizeException: -727379968
                at ru.magarusik.head.one.tasks_four.Task2.main(Task2.java:7)
                """);
    }
}
