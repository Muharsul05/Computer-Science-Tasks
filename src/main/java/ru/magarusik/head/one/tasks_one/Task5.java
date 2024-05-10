package ru.magarusik.head.one.tasks_one;

import java.util.Arrays;

public class Task5 {
    /*
    Опишите, что произойдет при попытке выполнить программу UseArgument
    каждой из следующих командных строк:
    a. java UseArgument.java
    b. java UseArgument.java @!&Л%
    c. java UseArgument.java 1234
    d. java UseArgument.java Bob
    e. java UseArgument.java Alice Bob
    */

    public static void main(String[] args) {
        System.out.println("Arguments: " + Arrays.toString(args));
        System.out.println("a: Arguments: [] -> Arguments: []");
        System.out.println("b: Arguments: [@!&Л%] -> error" + """
                At line:1 char:17
                + java Task5.java @!&Л%
                +                 ~
                Unrecognized token in source text.
                At line:1 char:19
                + java Task5.java @!&Л%
                +                   ~
                The ampersand (&) character is not allowed. The & operator is reserved for future use; wrap an ampersand in double quotation marks ("&") to pass it as part of a string.
                    + CategoryInfo          : ParserError: (:) [], ParentContainsErrorRecordException
                    + FullyQualifiedErrorId : UnrecognizedToken
                """);
        System.out.println("c: Arguments: [1234] -> Arguments: [1234]");
        System.out.println("d: Arguments: [Bob] -> Arguments: [Bob]");
        System.out.println("e: Arguments: [Alice Bob] -> Arguments: [Alice, Bob]");
    }
}
