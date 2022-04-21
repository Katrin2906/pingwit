package org.example.homework_3.homework_2.task_1;

public class RunningSumm {
    public static void main(String[] args) {

        double initialDist = 10;
        double existingDist = initialDist;
        double summaryDist = initialDist;

        for (int days = 1; days < 7; days = days + 1) {

            existingDist = existingDist + existingDist / 10;

            summaryDist = summaryDist + existingDist;
        }
        System.out.println("Общее расстояние " + summaryDist + "км");
    }
}
