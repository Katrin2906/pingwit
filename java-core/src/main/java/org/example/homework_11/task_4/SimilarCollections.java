package org.example.homework_11.task_4;

import java.util.ArrayList;
import java.util.List;

// +
public class SimilarCollections {
    public static void main(String[] args) {
        List<String> child = new ArrayList<>();
        child.add("Alex");
        child.add("Valera");
        child.add("Mary");
        child.add("Kate");
        child.add("Mustafa");
        
        System.out.println("First collection " + child);
        
        List<String> boys = new ArrayList<>();
        boys.add("Alex");
        boys.add("Valera");
        boys.add("Mustafa");
        
        System.out.println("Second collection " + boys);
        
        child.retainAll(boys);
       
        System.out.println("Last result " + child);
    }
}
