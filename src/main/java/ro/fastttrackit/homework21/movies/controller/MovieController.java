package ro.fastttrackit.homework21.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fastttrackit.homework21.movies.model.Movie;
import ro.fastttrackit.homework21.movies.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    List<Movie> getAll() {
        return movieService.getAll();
    }
}
