package org.example.homework_11.task_11;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindName {
    public static void main(String[] args) {
        // очень много действий получилось - из массива и лист и из листа в трисет. Лучше так не делать
        String[] array = {"Harry", "Mindy", "Alex", "Valera", "Kam", "Wisper"};
        List<String> list = Arrays.asList(array);
        Set<String> set = new TreeSet<>(list);
        System.out.println(set);

        Pattern pattern = Pattern.compile("[H-W]");
        Matcher matcher = pattern.matcher((CharSequence) set);
        while (matcher.find()) // всегда используй {} 
            System.out.println(matcher.group());
    }
}
