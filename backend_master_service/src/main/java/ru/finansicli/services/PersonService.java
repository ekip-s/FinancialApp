package ru.finansicli.services;

import org.springframework.stereotype.Service;
import ru.finansicli.models.Person;

@Service
public interface PersonService {

    void savePerson(Person person);
    Person getPersonByLogin(String username);
    Person getPersonById(long id);
    void deletePersonById(long id);
}
