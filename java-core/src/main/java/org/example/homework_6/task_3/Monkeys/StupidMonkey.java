package org.example.homework_6.task_3.Monkeys;

import org.example.homework_6.task_3.Trees.Branch;
import org.example.homework_6.task_3.Trees.FruitType;

public class StupidMonkey implements Monkey {

    private final FruitType fruitType;

    public StupidMonkey(FruitType fruitType) {
        this.fruitType = fruitType;
    }

    @Override
    public int countFruits(Branch branch) {
        int result = 0;
        for (Branch child : branch.getBranches()) {
            result += countFruits(child);
        }

        if (fruitType.equals(branch.getFruitType())) {
            result += branch.getNumFruits();
        }
        return result;
    }

    @Override
    public void sayHi() {
        System.out.println("I'm a stupid monkey. I can count only " + fruitType + "s");
    }

    @Override
    public String toString() {
        return "StupidMonkey{" +
                "fruitType=" + fruitType +
                '}';
    }
}
