package ro.fastttrackit.homework21.movies.service;

import org.springframework.stereotype.Service;
import ro.fastttrackit.homework21.movies.model.Movie;
import ro.fastttrackit.homework21.movies.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> getAll() {
        return repository.findAll();
    }
}
