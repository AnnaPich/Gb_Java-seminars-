package Lesson_1;

public class task3 {
    public static void main(String[] args) {

        System.out.println(getCommonPrefix(new String[]{"aaab", "aacc", "aacd"}));
        System.out.println(getCommonPrefix(new String[]{"abc", "abd", "cde"}));
        System.out.println(getCommonPrefix(new String[]{"aaaaa", "aaaaa", "aaaaacde"}));
    }

    /**
     * Задача 3:
     * Напишите метод, который находит самую длинную строку общего префикса
     * среди массива строк.
     * Если общего префикса нет, то вернет пустую строку
     * ["aaab", "aacc", "aacd"] -> "aa"
     * ["abc", "abd", "cde"] -> ""
     * ["aaaaa", "aaaaa", "aaaaacde"] -> "aaaaa"
     */


    static String getCommonPrefix(String[] array) {
        String commonPrefix = array[0]; // "aaab"
        for (int i = 1; i < array.length; i++) {
            String second = array[i]; //"aacc"
            int minLength = Math.min(commonPrefix.length(), second.length()); //минимальная длина
            for (int j = 0; j < minLength; j++) {
                if (commonPrefix.charAt(j) != second.charAt(j)) {
                    commonPrefix = commonPrefix.substring(0, j);
                    break;
                }
            }
        }
        return commonPrefix;
    }

}

