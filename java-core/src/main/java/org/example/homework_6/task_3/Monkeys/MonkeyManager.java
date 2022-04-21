package org.example.homework_6.task_3.Monkeys;


import homework_6.task_3.Trees.Branch;

public class MonkeyManager {

    public static void askMonkeyToCountFruits(Monkey monkey, Branch branch) {
        System.out.println(monkey + " says that number of fruits on " + branch + " is " + monkey.countFruits(branch));
    }
}

