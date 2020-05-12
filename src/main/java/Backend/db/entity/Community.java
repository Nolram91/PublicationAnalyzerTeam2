package Backend.db.entity;
import Backend.db.misc.Auditable;
//import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
//import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="COMMUNITY_TABLE")
public class Community extends Auditable {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @Column(name = "BESCHREIBUNG", nullable = true, length = 90)
    private String beschreibung;

    @OneToMany(mappedBy = "community")
    Set<PublicationRating> ratings;

    public Community(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Set<PublicationRating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<PublicationRating> ratings) {
        this.ratings = ratings;
    }
}

