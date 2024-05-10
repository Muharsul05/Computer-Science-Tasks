package ru.magarusik.head.one.tasks_one;

public class Task6 {
    /*
    Модифицируйте программу UseArgument.java — создайте на ее основе программу UseThree.java.
    Новая программа должна получать три имени в аргументах командной строки и выводить предложение,
    в котором эти имена перечисляются в обратном порядке, — например, для команды
    java UseThree Alice Bob Carol должно выводиться сообщение Hi Carol, Bob, and Alice.
     */

    public static void main(String[] args) {
        System.out.println("Hi " + args[2] + ", " + args[1] + " and " + args[0]);
    }
}
