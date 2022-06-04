package com.movie_info_service.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie_info_service.demo.models.movies;

@RestController
@RequestMapping("/movies")
public class movieInfoController {
    @RequestMapping("/{id}")
    public movies getMovies(@PathVariable("id") int id) {
        movies movie = new movies(1, "Godzill", "A movie about a Japneses dinosaur");
        movies movie2 = new movies(2, "Star Wars", "Sheenegans in Space");
        if (movie.getId() == id)
            return movie;
        return movie2;
    }
}
