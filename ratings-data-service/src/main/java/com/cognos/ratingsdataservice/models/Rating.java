package com.cognos.ratingsdataservice.models;

import lombok.Data;

@Data
public class Rating {
    private String movieId;
    private String ratingId;

    public Rating(String movieId, String ratingId) {
        this.movieId = movieId;
        this.ratingId = ratingId;
    }
}
