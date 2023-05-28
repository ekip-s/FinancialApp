package ru.finansicli.services;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import ru.finansicli.exception.NotFoundException;
import ru.finansicli.models.Person;
import ru.finansicli.repositories.PeopleRepository;

@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {


    //нужно внедрить dto
    // - проводить проверку на стороне сервера
    // - и возвращать статус авторизации;
    private final PeopleRepository peopleRepository;

    public PersonServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
        peopleRepository.save(person.setParameters());
    }

    @Override
    public Person getPersonByLogin(String username) {
        return peopleRepository
                .findByUsername(username)
                .orElseThrow(() -> new NotFoundException("Такого пользователя нет!"));
    }

    @Override
    public Person getPersonById(long id) {
        return peopleRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Нет пользователя с id=" + id + "."));
    }

    @Override
    @Transactional
    public void deletePersonById(long id) {
        peopleRepository
                .deleteById(id);
    }
}
