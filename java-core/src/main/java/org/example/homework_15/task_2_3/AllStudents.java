package org.example.homework_15.task_2_3;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AllStudents { // AllStudents - больше похоже на описание одного студента, а название говорит что все
// лишняя строка
    @JsonProperty("groupNumber")
    private String groupNumber;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("faculty")
    private String faculty;
    @JsonProperty("List<FavoriteClasses")
    private List<FavoriteClasses> favoriteClasses;

    public List<FavoriteClasses> getFavoriteClasses() {
        return favoriteClasses;
    }

    public void setFavoriteClasses(List<FavoriteClasses> favoriteClasses) {
        this.favoriteClasses = favoriteClasses;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "AllStudents{" +
                "groupNumber='" + groupNumber + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", favoriteClasses=" + favoriteClasses +
                '}';
    }
}
