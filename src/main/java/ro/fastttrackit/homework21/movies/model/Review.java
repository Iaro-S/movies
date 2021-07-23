package ro.fastttrackit.homework21.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Integer id;

    private String text;
    private String reviewer;

    public Review() {
    }

    public Review(String text, String reviewer) {
        this.text = text;
        this.reviewer = reviewer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return "Rewiew{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", reviewer='" + reviewer + '\'' +
                '}';
    }
}
