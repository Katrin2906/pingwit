package org.example.homework_15.task_4;

import java.util.Objects;

public class Movie {
    private Integer id;
    private String name;
    private Integer releaseYear;
    private String country;
    private String genre;
    private String quality;
    private String translation;
    private String duration;
    private Integer premiereYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getPremiereYear() {
        return premiereYear;
    }

    public void setPremiereYear(Integer premiereYear) {
        this.premiereYear = premiereYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) && Objects.equals(name, movie.name) && Objects.equals(releaseYear, movie.releaseYear) && Objects.equals(country, movie.country) && Objects.equals(genre, movie.genre) && Objects.equals(quality, movie.quality) && Objects.equals(translation, movie.translation) && Objects.equals(duration, movie.duration) && Objects.equals(premiereYear, movie.premiereYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, releaseYear, country, genre, quality, translation, duration, premiereYear);
    }
}
