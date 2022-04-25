package org.example.homework_15.task_2_3;

import java.util.Comparator;

public class StudentsNameComparator implements Comparator<AllStudents> {
    @Override
    public int compare(AllStudents o1, AllStudents o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
