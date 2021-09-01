package com.friendsflix.responses;

import java.util.List;

public class MovieListResponse {
    private List<MovieResponse> movies;

    public MovieListResponse(List<MovieResponse> movies) {
        this.movies = movies;
    }

    public List<MovieResponse> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieResponse> movies) {
        this.movies = movies;
    }
}

