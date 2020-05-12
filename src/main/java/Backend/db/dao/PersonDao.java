package Backend.db.dao;

import Backend.db.entity.Contact;
import Backend.db.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonDao extends JpaRepository<Person, Integer> {

    @Query(value="select * From PERSON_TABLE c Join PUBLICATION_TABLE a ON c.account1_id=a.id",
            nativeQuery = true)
    List<Contact> getAllPersonsWithPublications();

    List<Contact> findPersonByActive(boolean active);

}
