package Backend.db.service;

import Backend.db.dao.PersonDao;
import Backend.db.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public List getAllPersons() {
        List personList = this.personDao.findPersonByActive(true);
        return personList;
    }

    public Person addPerson(Person person) {
        /*if (this.personDao.existsByName(person.getNachname())) {
            return null;
        }*/
        return this.personDao.save(person);
    }

    public List<Person> getAllPersonsWithPublications() {

        List personList = this.personDao.getAllPersonsWithPublications();
        return personList;
    }

    public List getAllPublicationFromPerson(String personName) {
        List contactList =new ArrayList<Person>();
        return contactList;
    }
}
