package org.example.homework_11.task_9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// +
public class StudentMain {
    public static void main(String[] args) {
        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();
        StudentNameComparator studentNameComparator = new StudentNameComparator();

        Comparator<Student> studentComparator = studentNameComparator.thenComparing(studentNameComparator);

        Set<Student> students = new TreeSet<>(studentComparator);
        students.add(new Student("Albert", 22));
        students.add(new Student("BillyBob", 40));
        students.add(new Student("Ann", 29));
        students.add(new Student("Garry", 18));
        System.out.println(students);

        Comparator<Student> studentComparatorAge = studentAgeComparator.thenComparing(studentAgeComparator);
        Set<Student> studentsAge = new TreeSet<>(studentComparatorAge);
        studentsAge.addAll(students);

        System.out.println(studentsAge);
    }
}
