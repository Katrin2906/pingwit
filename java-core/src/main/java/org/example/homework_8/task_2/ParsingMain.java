package org.example.homework_8.task_2;

public class ParsingMain {
    public static void main(String[] args) {
        try {
            Parsing.Parsing("rgf");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please try again.");
        }
    }
}
