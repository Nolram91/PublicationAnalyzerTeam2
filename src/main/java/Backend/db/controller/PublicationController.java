package Backend.db.controller;

import Backend.db.entity.Person;
import Backend.db.entity.Publication;
import Backend.db.service.PersonService;
import Backend.db.service.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publications")
@CrossOrigin(origins = "http://localhost:4200")
public class PublicationController {

    @Autowired
    PublicationService publicationService;

    @GetMapping(path = {"/all"})
    public List getAllPublications() {
        return publicationService.getAllPublications();
    }

    @PostMapping(path={"/add"})
    public Publication addNewPublication(@RequestBody Publication publication) {
        return this.publicationService.addPublication(publication);
    }
}
