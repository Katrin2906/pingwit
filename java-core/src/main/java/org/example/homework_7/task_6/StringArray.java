package org.example.homework_7.task_6;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        String[] oldWords = {"World", "dog", "stolen", "west", "Ann", "Wendy", "Egorka" };
        int count = 0;

        // слишком много усилий и лишних итераций в твоем коде. Сначала узнай сколько нужных слов в массиве, затем создай массив нужного размера
        // вторым шагом еще раз пройдись по исходному массиву и добавь в новый нужные слова
        // в своем коде ты учитываешь только большую букву W, а надо еще и маленькую
        for (int i = 0; i < oldWords.length; i++) {

            if (oldWords[i].contains("W")||oldWords[i].contains("w")) {

                System.out.println("нашел " + oldWords[i]);
                count++;
                String[] newWords = new String[count];

                for (int j = 0; j < count; j++) {

                    if (oldWords[i].contains("W")) {
                        newWords[j] = oldWords[i];
                    }
                }
                System.out.println(Arrays.toString(newWords));
            }
        }
    }
}


