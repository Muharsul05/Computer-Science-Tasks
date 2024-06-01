package ru.magarusik.head.one.tasks_three;

public class Task_11 {
    /*
    Опишите, что произойдет при попытке вызвать функцию расчета делений
    на линейке (см. листинг на с. 42) со слишком большим значением
    n — например, 100.
     */
    public static void main(String[] args) {
        StringBuilder ruler = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            String temp = ruler.toString();
            ruler.append(i).append(temp);
            System.out.println(ruler);
        }

        System.out.println("Получается что мы c каждый разом увеличиваем размер строки в 2 раза и увеличиваеим на 1");
        System.out.println("Из-за чего выводится OutOfMemoryError так как строка выходит за пределалы заданного " +
                           "\nзначения размера массива: 1_075_838_974 * 2 + 1 > 2_147_483_647"
        );
    }
}
