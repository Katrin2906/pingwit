package org.example.homework_9.task_7;

import java.io.File;

public class FileSystem {

    public void search(File path) {
        File[] newList = path.listFiles();
        if (newList == null) return; // всегда используй скобки {} для блока if и др
        for (File roots : path.listFiles()) {
            if (roots.isDirectory()) {
                search(new File(roots.getPath()));
                System.out.println(roots.getPath() + "== КАТАЛОГ==");
            } else {
                System.out.println(roots.getPath() + " ==Файл==");
            }
        }
    }
}
