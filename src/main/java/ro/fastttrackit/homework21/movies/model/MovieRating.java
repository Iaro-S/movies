package ro.fastttrackit.homework21.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieRating {
    @Id
    @GeneratedValue
    private Integer id;
    private int rating;
    private String agency;


    public MovieRating() {
    }

    public MovieRating(int rating, String agency) {
        this.rating = rating;
        this.agency = agency;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "MovieRating{" +
                "id=" + id +
                ", rating=" + rating +
                ", agency='" + agency + '\'' +
                '}';
    }
}
