package Backend.db.controller;

import Backend.db.entity.Contact;
import Backend.db.entity.Person;
import Backend.db.service.ContactService;
import Backend.db.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(path = {"/all"})
    public List getAllContacts() {
        return personService.getAllPersonsWithPublications();
    }

    @PostMapping(path={"/add"})
    public Person addNewPerson(@RequestBody Person person) {
        return this.personService.addPerson(person);
        //return this.contactService.addContactToGroup(resultContact);
    }
}
