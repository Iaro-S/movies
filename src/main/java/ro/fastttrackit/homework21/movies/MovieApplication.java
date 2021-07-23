package ro.fastttrackit.homework21.movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fastttrackit.homework21.movies.model.*;
import ro.fastttrackit.homework21.movies.repository.ActorsRepository;
import ro.fastttrackit.homework21.movies.repository.MovieRepository;
import ro.fastttrackit.homework21.movies.repository.StudioRepository;

import java.util.List;

@SpringBootApplication
public class MovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
    }

    @Bean
    CommandLineRunner atStart(MovieRepository repository, StudioRepository studioRepository, ActorsRepository actorsRepository) {
        return args -> {
            Studio firstStudio = studioRepository.save(new Studio("Warner Brothers", "Los Angeles"));
            Studio secondStudio = studioRepository.save(new Studio("Columbia Pictures", "Columbia"));

            Actors firstActor = actorsRepository.save(new Actors("Robert de Niro", 1943));
            Actors secondActor = actorsRepository.save(new Actors("Al Pacino", 1940));
            Actors thirdActor = actorsRepository.save(new Actors("Matt Damon", 1970));
            Actors fourthActor = actorsRepository.save(new Actors("Angelina Jolie", 1975));
            Actors fifthActor = actorsRepository.save(new Actors("Natalie Portman", 1981));
            Actors sixthActor = actorsRepository.save(new Actors("Johnny Depp", 1963));

            repository.saveAll(List.of(
                    new Movie("The Irishman", 2019, new MovieRating(8, "General Audiences"),
                            listOfReviews(), firstStudio, List.of(firstActor, secondActor, fifthActor)),
                    new Movie("Righteous Kill", 2008, new MovieRating(6, "Restricted"),
                            listOfReviews1(), firstStudio, List.of(firstActor, secondActor, thirdActor, fifthActor)),
                    new Movie("Dumb and Dumber", 1994, new MovieRating(9, "General Audiences"),
                            listOfReviews1(), secondStudio, List.of(sixthActor, fourthActor)),
                    new Movie("The Worst Week of My Life", 2011, new MovieRating(7, "Parental Guidance Suggested"),
                            listOfReviews(), secondStudio, List.of(fifthActor)),
                    new Movie("K-PAX", 2001, new MovieRating(8, "Parental Guidance Suggested"),
                            listOfReviews2(), firstStudio, List.of(thirdActor, fourthActor)),
                    new Movie("There Is No Place Like Home", 2018, new MovieRating(5, "IMDB"),
                            listOfReviews3(), secondStudio, List.of(secondActor, fifthActor, firstActor)),
                    new Movie("Blame Freud", 2014, new MovieRating(3, "Clearly Adult"),
                            listOfReviews3(), secondStudio, List.of(firstActor, sixthActor)),
                    new Movie("House", 1985, new MovieRating(5, "Parents Strongly Cautioned"),
                            listOfReviews3(), firstStudio, List.of(secondActor, thirdActor)),
                    new Movie("Blow-Up", 1966, new MovieRating(4, "Restricted"),
                            listOfReviews1(), secondStudio, List.of(firstActor, thirdActor, fifthActor, sixthActor)),
                    new Movie("Never Back Down 2", 2011, new MovieRating(9, "Clearly Adult"),
                            listOfReviews1(), firstStudio, List.of(thirdActor,  secondActor, fourthActor, sixthActor))

            ));
        };
    }

    private List<Review> listOfReviews() {
        return List.of(new Review("review1", "Gigi"), new Review("review4", "Amalia"));
    }

    private List<Review> listOfReviews1() {
        return List.of(new Review("Oscar movie", "Mihai"));
    }

    private List<Review> listOfReviews2() {
        return List.of(new Review("Golden Globe deserve", "Maria"), new Review("review2", "Ion"), new Review("Review3", "Ana"));
    }

    private List<Review> listOfReviews3() {
        return List.of(new Review("review4", "Mihai"), new Review("review3", "Ioana"), new Review("review6", "Ana"));
    }

}
