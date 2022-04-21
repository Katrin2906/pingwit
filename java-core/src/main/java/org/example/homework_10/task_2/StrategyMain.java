package org.example.homework_10.task_2;

public class StrategyMain {
    public static void main(String[] args) {

        String[] name = {"Tjknj98hj", "HgtTTTjjn", " "};

        for (int i = 0; i < name.length; i++) {

            FileNameStrategy strategy = FileNameStrategy.LOWERCASE;
            System.out.println(strategy.rename(name[i]));

            FileNameStrategy strategy1 = FileNameStrategy.UPPERCASE;
            System.out.println(strategy1.rename(name[i]));

            FileNameStrategy strategy2 = FileNameStrategy.UPPERFIRST;
            System.out.println(strategy2.rename(name[i]));
        }
    }
}
