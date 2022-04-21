package org.example.homework_6.task_3.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

    public abstract class Branch {

        private static final int FRUITS_LIMIT_TO_GENERATE = 20;

        private final Integer numFruits;
        private final List<Branch> branches;

        public Branch() {
            this(ThreadLocalRandom.current().nextInt(0, FRUITS_LIMIT_TO_GENERATE));
        }

        public Branch(Integer numFruits) {
            this.numFruits = numFruits;
            branches = new ArrayList<>();
        }

        public List<Branch> getBranches() {
            return List.copyOf(branches);
        }

        public Integer getNumFruits() {
            return numFruits;
        }

        public void addBranch(Branch branch) {
            branches.add(branch);
        }

        public void showFruits() {
            System.out.println(getFruitType());
            showFruits("");
        }

        private void showFruits(String indent) {
            System.out.println(indent + numFruits);
            for (Branch branch : branches) {
                branch.showFruits(indent + "| ");
            }
        }

        public abstract FruitType getFruitType();
    }

