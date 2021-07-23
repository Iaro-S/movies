package ro.fastttrackit.homework21.movies.model;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Integer id;

    private String movie;
    private int year;
    @OneToOne(cascade = ALL)
    private MovieRating movieRating;

    @OneToMany(cascade = ALL)
    private List<Review> reviews;

    @ManyToOne
    private Studio studio;

    @ManyToMany
    private List<Actors> actors;

    public Movie() {
    }

    public Movie(String movie, int year, MovieRating movieRating, List<Review> reviews, Studio studio, List<Actors> actors) {
        this.movie = movie;
        this.year = year;
        this.movieRating = movieRating;
        this.reviews = reviews;
        this.studio = studio;
        this.actors = actors;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", movie='" + movie + '\'' +
                ", year=" + year +
                '}';
    }

    public MovieRating getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(MovieRating movieRating) {
        this.movieRating = movieRating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public List<Actors> getActors() {
        return actors;
    }

    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }
}
