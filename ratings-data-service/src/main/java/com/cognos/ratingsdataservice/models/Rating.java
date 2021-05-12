package com.cognos.ratingsdataservice.models;

import lombok.Data;

@Data
public class Rating {
    private String movieId;
    private int ratingId;

    public Rating(String movieId, int ratingId) {
        this.movieId = movieId;
        this.ratingId = ratingId;
    }
}
