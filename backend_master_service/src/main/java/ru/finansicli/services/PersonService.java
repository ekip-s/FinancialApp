package ru.finansicli.services;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import ru.finansicli.exception.NotFoundException;
import ru.finansicli.models.Person;
import ru.finansicli.repositories.PeopleRepository;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class PersonService {

    private final PeopleRepository peopleRepository;

    public PersonService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void savePerson(Person person) {
        peopleRepository.save(person);
    }

    public Person getPersonOfLogin(String username) {
        Optional<Person> person = peopleRepository.findByUsername(username);

        if (person.isEmpty())
            throw new NotFoundException("User not found!");

        return person.get();
    }
}
