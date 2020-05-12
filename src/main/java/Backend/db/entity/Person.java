package Backend.db.entity;

import Backend.db.misc.Auditable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PERSON_TABLE")
@Transactional
public class Person extends Auditable {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NACHNAME", nullable = false, length = 30)
    private String nachname;

    @Column(name = "VORNAME", nullable = false, length = 30)
    private String vorname;

    @Column(name = "AVGRATING")
    private double avgRating;

    // 1 Person -> x Publications
    @OneToMany( mappedBy = "person")
    @JsonIgnoreProperties(value = {"person","publications"})
    private Set<Publication> publications = new HashSet<>();

    @Column(name = "ACTIVE")
    private Boolean active;

    public Person() {
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public Set<Publication> getPublications() {
        return publications;
    }

    public void setPublications(Set<Publication> publications) {
        this.publications = publications;
    }
}
