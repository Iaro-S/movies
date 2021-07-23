package ro.fastttrackit.homework21.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fastttrackit.homework21.movies.model.Actors;

public interface ActorsRepository extends JpaRepository<Actors, Integer> {
}
