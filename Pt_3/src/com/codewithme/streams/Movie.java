package com.codewithme.streams;

public class Movie {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    // sorted() 에서 사용하기 위해 정의할 수도 있지만 호출 환경에서 바로 lambda로 정의하면 상관없다.
//    @Override
//    public int compareTo(Movie o) {
//        return 0;
//    }
}
