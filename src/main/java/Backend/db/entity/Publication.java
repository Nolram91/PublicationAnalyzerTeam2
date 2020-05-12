package Backend.db.entity;

import Backend.db.misc.Auditable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.Set;

@Entity
@Table(name = "PUBLICATION_TABLE")
@Transactional
public class Publication extends Auditable {

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NAME", nullable = false, length = 30)
    private String name;

    @OneToMany(mappedBy = "publication")
    Set<PublicationRating> ratings;

    // x Publications -> 1 Person
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "Person_id")
    @JsonIgnoreProperties(value = "persons")
    public Person person;

    @Column(name = "ACTIVE")
    private Boolean active;

    public Publication() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PublicationRating> getRatings() {
        return ratings;
    }

    public void setRatings(Set<PublicationRating> ratings) {
        this.ratings = ratings;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
