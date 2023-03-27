package Lesson_1;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        int[] array = {3, 2, 2, 3};
        newArray(array, 3);
        System.out.println(Arrays.toString(array));
        shift(array, 3);
        System.out.println(Arrays.toString(array));

        int[] array2 = {3, 2, 1, 3, 2, 1, 3};
        newArray(array2, 3);
        System.out.println(Arrays.toString(array2));
        shift(array2, 3);
        System.out.println(Arrays.toString(array2));
    }

    /**
     * Задача 2:
     * Дан массив nums [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
     * Таким образом первые несколько (или все) элементов массива должны быть отличенны от заданного, а остальные - равны ему.
     * [3,2,2,3] -> [2,2,3,3]
     */


    static void newArray (int[] array, int val) {
        int count = 0;
        for (int i = 0 ; i < array.length; i++) {
            if (array[i] != val) {
                array[count] = array[i];
                count++;
            }
        }
        for (int i = count; i < array.length; i++) {
            array[i] = val;
        }
        }


    static void shift (int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j] != val) {
                        int tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                        break;
                    }
                }
            }
        }
    }
}