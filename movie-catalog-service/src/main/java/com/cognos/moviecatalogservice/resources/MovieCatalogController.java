package com.cognos.moviecatalogservice.resources;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

import com.cognos.moviecatalogservice.models.CatalogItem;
import com.cognos.moviecatalogservice.models.Movie;
import com.cognos.moviecatalogservice.models.Rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/catalogs")
public class MovieCatalogController {

    @Autowired
    private RestTemplate rt;

    @GetMapping("/{userId}")
    public List<CatalogItem> index(@PathVariable("userId") String userId) {

        List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 5));
        return ratings.stream().map(rating -> {
            Movie mv = rt.getForObject("http://localhost:8081/movies/" + rating.getMovieId(), Movie.class);

            return new CatalogItem(mv.getName(), "Test", rating.getRatingId());
        }).collect(Collectors.toList());
        // for each movie ID,call movie info service and products

        // return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
    }
}
