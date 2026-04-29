package exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import exam.entity.person;
import exam.repository.personRepository;

@Service
public class personService {

    private final personRepository repo;

    @Autowired
    public personService(personRepository repo) {
        this.repo = repo;
    }

    public person addPerson(person person) {
        return repo.save(person);
    }
}
