package ru.magarusik.head.one.tasks_three;

public class Task_14 {
    /*
    Что выводит следующий фрагмент кода?
    int f = 0, g = 1;
    for(int i = 0; i <= 15; i++) {      1. i = 0 | 2. i = 1 | 3. i = 2 | 4. i = 3 | 5. i = 4 | 6. i = 5 | 7. i = 6  |
        System.out.println(f);          1. 0     | 2. 1     | 3. 1     | 4. 2     | 5. 3     | 6. 5     | 7. 8      |
        f = f + g;                      1. f = 1 | 2. f = 1 | 3. f = 2 | 4. f = 3 | 5. f = 5 | 6. f = 8 | 7. f = 13 |
        g = f - g;                      1. g = 0 | 2. g = 1 | 3. g = 1 | 4. g = 2 | 5. g = 3 | 6. g = 5 | 7. g = 8  |
    }
     */
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
