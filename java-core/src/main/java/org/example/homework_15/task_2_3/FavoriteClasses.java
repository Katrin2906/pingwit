package org.example.homework_15.task_2_3;

public class FavoriteClasses {
    private String favoriteClass;

    public String getFavoriteClass() {
        return favoriteClass;
    }

    public void setFavoriteClass(String favoriteClass) {
        this.favoriteClass = favoriteClass;
    }

    @Override
    public String toString() {
        return "FavoriteClasses{" +
                "favoriteClass='" + favoriteClass + '\'' +
                '}';
    }
}
