package org.example.homework_4.task_3;

import org.example.homework_4.task_1.Dwarfs;

public class DwarfsArray {
    public static void main(String[] args) {
        Dwarfs[] dwarf = new Dwarfs[7];

        dwarf[0] = new Dwarfs("Balin", "231");
        dwarf[1] = new Dwarfs("Bofur", "202");
        dwarf[2] = new Dwarfs("Bombur", "241");
        dwarf[3] = new Dwarfs("Bofur", "202");
        dwarf[4] = new Dwarfs("Bofur", "202");
        dwarf[5] = new Dwarfs("Dwalin", "340");
        dwarf[6] = new Dwarfs("Balin", "231");

        int similar = 0;

        for (int i = 0; i < dwarf.length; i++) {
            for (int j = i + 1; j < dwarf.length; j++) {
                if (dwarf[i].equals(dwarf[j])) {
                    similar++;
                    System.out.println("Overlap! " + " Array number " + i + " array element" + dwarf[i] + " with array number " + j + " array element " + dwarf[j]);
                }
            }
        }
        System.out.println("Similar objects = " + similar);
    }
}
