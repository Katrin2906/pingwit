package org.example.homework_9.task_6;

public class Path {
    private static final String IMAGE = ("src/main/java/homework_9/task_6/pngegg.png");
    private String path;

    Path(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }
}
