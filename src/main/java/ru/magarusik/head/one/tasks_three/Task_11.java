package ru.magarusik.head.one.tasks_three;

public class Task_11 {
    /*
    Опишите, что произойдет при попытке вызвать функцию расчета делений
    на линейке (см. листинг на с. 42) со слишком большим значением
    n — например, 100.
     */
    public static void main(String[] args) {
        String ruller = "1";
        for (int i = 2; i < 100; i++) {
            var temp = ruller + i + ruller;
            ruller = temp;
            System.out.println(i + ": " + ruller.length());
        }

        System.out.println("""
                Exception in thread "main" java.lang.OutOfMemoryError: Overflow: String length out of range
                	at java.base/java.lang.StringConcatHelper.checkOverflow(StringConcatHelper.java:68)
                	at java.base/java.lang.StringConcatHelper.mix(StringConcatHelper.java:127)
                	at ru.magarusik.head.one.tasks_three.Task_11.main(Task_11.java:13)
                """);
        System.out.println("Получается что мы c каждый разом увеличиваем размер строки в 2 раза и увеличиваеим на 1");
        System.out.println("Из-за чего выводится OutOfMemoryError так как строка выходит за пределалы заданного " +
                "\nзначения размера массива: 1_075_838_974 * 2 + 1 > 2_147_483_647"
        );
    }
}
