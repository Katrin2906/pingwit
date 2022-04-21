package org.example.homework_7.task_2;


public class StringReverse_1 {

    public static char charAt() {
        return charAt();
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) { // а не проще было бы бежать с конца строки?
            result = str.charAt(i) + result;
        }
        return result;
    }
}