package org.example.homework_6.task_3.Monkeys;

import org.example.homework_6.task_3.Trees.Branch;

public class SmartMonkey implements Monkey {

    @Override
    public int countFruits(Branch branch) {
        int result = branch.getNumFruits();

        for (Branch child : branch.getBranches()) {
            result += countFruits(child);
        }
        return result;
    }

    @Override
    public void sayHi() {
        System.out.println("I'm a smart monkey. I can count any fruits");
    }

    @Override
    public String toString() {
        return "SmartMonkey";
    }
}
