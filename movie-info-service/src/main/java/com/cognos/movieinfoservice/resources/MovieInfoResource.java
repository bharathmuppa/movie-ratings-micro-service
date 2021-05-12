package com.cognos.movieinfoservice.resources;

import com.cognos.movieinfoservice.models.Movie;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String id) {
        return new Movie("1", "IronMan");
    }
}
