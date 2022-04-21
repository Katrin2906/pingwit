package org.example.homework_6.task_1;

public class RecursionCycleMain {
    public static void main(String[] args) {

        RecursionCycle recursion = new RecursionCycle(6);
        int recNum = 6;
        for (int x = 0; x < recNum; x++) {
            recursion.cycle[x] = x;
        }
        recursion.printCycle(6);
    }
}

// лучше делай классы в отдельном файле
class RecursionCycle {

    int cycle[];

    RecursionCycle(int i) {
        cycle = new int[i];

    }

    int i;
    int round = (i - 1);

    void printCycle(int i) {
        if (i == 0) {
            return;
        }
        printCycle(round);
        System.out.println("Array element [" + round + "] " + cycle[round]);
    }
}



