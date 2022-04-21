package org.example.homework_13.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxLength {
    public static void main(String[] args) {
        List<String> badBusiness = new ArrayList<>(5);
        badBusiness.add("Cassio");
        badBusiness.add("Omega");
        badBusiness.add("Breguet");
        badBusiness.add("Rolex");
        badBusiness.add("Piaget");
        System.out.println("Initial collection " + badBusiness);

        // newWord - название переменной должно отображать ее содержимое
        Optional<String> newWord = badBusiness.stream()
                .max(Comparator.naturalOrder());

        String maxLength = badBusiness.stream()
                .max(String::compareTo).get();

        System.out.println(newWord);
        System.out.println(maxLength); //только эти стримы возвращают сортировку по алфавиту

        Optional<String> realWord = badBusiness.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(realWord); // а этот по длине строки
    }
}
