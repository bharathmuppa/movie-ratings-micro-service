package com.cognos.movieinfoservice.models;

import lombok.Data;

@Data
public class Movie {
    private String id;
    private String name;
    private String description;

    public Movie(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Movie(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
