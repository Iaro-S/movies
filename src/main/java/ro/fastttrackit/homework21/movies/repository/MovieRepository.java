package ro.fastttrackit.homework21.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fastttrackit.homework21.movies.model.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findAll();
}
