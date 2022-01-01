package com.codewithme.streams;

public class Movie {
    private String title;
    private int likes;
    private Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    // sorted() 에서 사용하기 위해 정의할 수도 있지만 호출 환경에서 바로 lambda로 정의하면 상관없다.
//    @Override
//    public int compareTo(Movie o) {
//        return 0;
//    }
}
