package Backend.db.dao;

import Backend.db.entity.Publication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublicationDao extends JpaRepository<Publication, Integer> {

    boolean existsByName(String publicationName);
    Publication findByName(String publicationName);
    List<Publication> findPublicationByActive(boolean active);

}
