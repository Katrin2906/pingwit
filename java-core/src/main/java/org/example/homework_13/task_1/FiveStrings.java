package org.example.homework_13.task_1;

import java.util.ArrayList;
import java.util.List;

public class FiveStrings {
    public static void main(String[] args) {
        List<String> badBusiness = new ArrayList<>(5); // badBuisness -> badBusiness
        badBusiness.add("Cassio");
        badBusiness.add("Omega");
        badBusiness.add("Breguet");
        badBusiness.add("Rolex");
        badBusiness.add("Piaget");

        System.out.println("Initial collection " + badBusiness);

        List<String> shortWord = badBusiness.stream()
                .filter(wordLength -> wordLength.length() >= 5)
                .toList();

        System.out.println("Sorted collection " + shortWord);
    }
}
