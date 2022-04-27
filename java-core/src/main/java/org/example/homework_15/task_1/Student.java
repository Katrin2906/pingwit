package org.example.homework_15.task_1;

public class Student {
    private String id;
    private String groupNumber;
    private String name;
    private String surname;
    private String faculty;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", groupNumber=" + groupNumber +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
