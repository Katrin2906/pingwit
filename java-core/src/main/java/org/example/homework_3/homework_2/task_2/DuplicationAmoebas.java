package org.example.homework_3.homework_2.task_2;

public class DuplicationAmoebas {
    public static void main(String[] args) {

        int time = 0;
        int amoebas = 1;

        do {
            System.out.println("Прошло " + time + " часа(-ов), стало " + amoebas + " амеб(-ы)");
            time = time + 3;
            amoebas = amoebas * 2;
        }
        while (time <= 24);


    }

}

