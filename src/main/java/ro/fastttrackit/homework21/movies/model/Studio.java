package ro.fastttrackit.homework21.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Studio {
    @Id
    @GeneratedValue
    private Integer id;

    private String studio;
    private String address;

    public Studio() {
    }

    public Studio(String studio, String address) {
        this.studio = studio;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "id=" + id +
                ", studio='" + studio + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
