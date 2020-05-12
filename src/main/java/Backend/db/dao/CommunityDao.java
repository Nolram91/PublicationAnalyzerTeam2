package Backend.db.dao;

import Backend.db.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommunityDao extends JpaRepository<Community, Integer> {

    boolean existsByName(String communityName);

    Community findByName(String communityName);

}
