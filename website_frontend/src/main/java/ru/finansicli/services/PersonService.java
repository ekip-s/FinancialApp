package ru.finansicli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.finansicli.client.PersonClient;
import ru.finansicli.models.Person;
import ru.finansicli.security.PersonDetails;

@Service
public class PersonService implements UserDetailsService {

    private final PersonClient personClient;

    @Autowired
    public PersonService(PersonClient personClient) {
        this.personClient = personClient;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person;

        try {
            person = personClient.findByUsername(username);
        } catch (Throwable e) {
            throw new UsernameNotFoundException("Такого пользователя нет");
        }

        return new PersonDetails(person);
    }
}
