package org.example.homework_8.task_3;

public class ArrayLength {

    private static final Integer MAX_VALUE = 20;
    private Integer arrayLength;

    public ArrayLength() {
    }

    public Integer validate(Integer arrayLength) throws ArrayExeption {
        if (arrayLength >= 0 && arrayLength <= MAX_VALUE) {
            return arrayLength;
        } else {
            throw new ArrayExeption("Out off array.");
        }
    }
}
