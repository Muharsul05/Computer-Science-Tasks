package ru.magarusik.head.one.tasks_three;

public class Task3 {
    /*
    Какая ошибка допущена в каждой из следующих команд (а может, ошибки нет)?
    a . if (а > b) then с = 0;              // ошибка: в java нет ключевого слова then
    b . if a > b {c=0;}                     // ошибка: пропущены скобки в условии
    c . if (а > Ь) с = 0;                   // нет ошибок
    d . if (а > b) с = 0 else b = 0 ;       // ошибка: полсе с = 0 нет точки с запятой
     */

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 0;
//        if (a > b) then c = 0;
//        if a > b {c = 0;}
        if (a > b) c = 0;
//        if (a>b) c = 0 else b = 0;
    }
}
