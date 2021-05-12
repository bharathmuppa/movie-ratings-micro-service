package com.cognos.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

import com.cognos.moviecatalogservice.models.CatalogItem;
import com.cognos.moviecatalogservice.models.Rating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogs")
public class MovieCatalogController {
    @GetMapping("/{userId}")
    public List<CatalogItem> index(@PathVariable("userId") String userId) {
        // get all rated movie IDs
        List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 5));
        return ratings.stream().map(rating -> {
            return new CatalogItem("Transformers", "Test", 4);
        }).collect(Collectors.toList());
        // for each movie ID,call movie info service and products

        // return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
    }
}
