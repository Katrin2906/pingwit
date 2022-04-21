package org.example.homework_6.task_3.Trees;


public class FruitBranch extends Branch {
    private final FruitType fruitType;

    public FruitBranch(FruitType fruitType) {
        super();
        this.fruitType = fruitType;
    }

    public FruitBranch(FruitType fruitType, Integer numFruits) {
        super(numFruits);
        this.fruitType = fruitType;
    }

    @Override
    public FruitType getFruitType() {
        return fruitType;
    }

    @Override
    public void addBranch(Branch branch) {
        if (fruitType.equals(branch.getFruitType())) {
            super.addBranch(branch);
        } else {
            System.out.println(branch.getFruitType() + " cannot grow on " + fruitType + " tree");
        }
    }

    @Override
    public String toString() {
        return "FruitBranch{" +
                "fruitType=" + fruitType +
                '}';
    }
}

