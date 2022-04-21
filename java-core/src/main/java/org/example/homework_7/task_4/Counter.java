package org.example.homework_7.task_4;

public class Counter {
    private static String otherText;
    private static final String MAIN_TEXT = "While major gameplay components are already in place and functioning,\n" +
            "players help is needed to add some of the smaller features and content.\n" +
            "Of course polishing the overall experience is important at the same time.\n" +
            "Game has been extensively tested in closed group, but good it is always important to hear fresh suggestions\n" +
            "from larger crowd that come from various gaming backgrounds.\n" +
            "Plan is to make the game as good as possible but without compromising the core add idea";

    public static Integer validator(String otherText) {
        if (textCompare() == -1) {
            return textCompare();
        } else {
            int index = MAIN_TEXT.indexOf(otherText);
            return MAIN_TEXT.indexOf(otherText, index);
        }
    }

    public static Integer textCompare() {
        return MAIN_TEXT.indexOf(otherText);
    }
}
// молодец что попробовала сделать это в форме классе, но здесь было бы достаточно класса с методом main + 1 приватный метод,
// с аргументом в виде виде строки для поиска или двумя аргументами String что_искать, String где_искать

// я заметил что плохо подобрал текст, поэтому ты тоже скорее всего не заметила проблему
// суть в том, что твой метод будет возвращать 0, если ничего не найдет и 1, если найдет 1 повтор. Но ведь повторений может быть гораздо больше
// тебе нужен был метод lastIndexOf(String str, int fromIndex), он возвращает -1, если ничего не найдено, или индекс где находится строка.
// Таким образом ты сможешь узнавать индекс и говорить программе с какого момента начинать искать следующий повтор



