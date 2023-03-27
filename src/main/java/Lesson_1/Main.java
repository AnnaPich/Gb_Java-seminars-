package Lesson_1;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 1, 0, 1, 1, 1};
        System.out.println(calculateMax(array, 1));

        int[] array2 = {1, 1, 0, 0, 1, 1};
        System.out.println(calculateMax(array2, 0));
    }

    /**
     * Задача 1:
     * Дан массив двоичных чисел, например [1,1,0,1,1,1],
     * вывести максимальное количество подряд идущих 1
     */


    static int calculateMax(int[] array, int number) {
        int count = 0;
        int maxCount = 0;
        for (int a : array) {
            if (a == 1) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount) {
            maxCount = count;
        }
        return maxCount;
    }
}