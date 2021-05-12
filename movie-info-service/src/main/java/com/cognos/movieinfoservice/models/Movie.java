package com.cognos.movieinfoservice.models;

import lombok.Data;

@Data
public class Movie {
    private String id;
    private String name;

    public Movie(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
