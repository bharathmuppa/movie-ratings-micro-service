package com.cognos.moviecatalogservice.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Movie {
    private String id;
    private String name;

    public Movie(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
