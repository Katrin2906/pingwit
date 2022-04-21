package org.example.homework_5.task_2;

// я бы рекомендовал добавить метод main для проверки
public class Warehouse {
    private Integer jawerly[];
    private Integer index;

   private Warehouse(Integer[] jawerly) {
        this.jawerly = jawerly;
        index = jawerly.length - 1;
    }

    public Warehouse(Integer index) {
        this.index = index;
    }

    public Integer next() {
        index = (index + 1) % jawerly.length;
        return jawerly[index];
    }

    public Integer[] getArray() {
        return jawerly;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
