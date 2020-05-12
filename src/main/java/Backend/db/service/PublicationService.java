package Backend.db.service;

import Backend.db.dao.PublicationDao;
import Backend.db.entity.Person;
import Backend.db.entity.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationService {

    @Autowired
    PublicationDao publicationDao;

    public List getAllPublications() {
        List publicationList = this.publicationDao.findPublicationByActive(true);
        return publicationList;
    }

    public Publication addPublication(Publication publication) {
        if (this.publicationDao.existsById(publication.getId())) {
            return null;
        }
        return this.publicationDao.save(publication);
    }
}
