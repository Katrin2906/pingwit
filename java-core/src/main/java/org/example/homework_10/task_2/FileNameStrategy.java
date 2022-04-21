package org.example.homework_10.task_2;

// Strategy -> FileNameStrategy. Просто Strategy слишком абстрактное название
public enum FileNameStrategy {

    LOWERCASE {
        public String rename(String name) {
            return name.toLowerCase();
        }
    },
    // для этой стратегии я бы еще разделял основное имя от расширения, чтобы файл task.txt не выглядел как TASK.TXT
    UPPERCASE {
        public String rename(String name) {
            return name.toUpperCase();
        }
    },
    UPPERFIRST {
        public String rename(String name) {
            // здесь может быть проблема, если имя файла передать как пустую строку
            return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
    };

    abstract String rename(String name);
}
