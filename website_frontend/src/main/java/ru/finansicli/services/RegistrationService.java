package ru.finansicli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.finansicli.client.PersonClient;
import ru.finansicli.models.Person;

@Service
public class RegistrationService {

    private final PasswordEncoder passwordEncoder;
    private final PersonClient personClient;

    @Autowired
    public RegistrationService(PasswordEncoder passwordEncoder, PersonClient personClient) {
        this.passwordEncoder = passwordEncoder;
        this.personClient = personClient;
    }

    public void register(Person person) {
        person.setPassword(passwordEncoder.encode(person.getPassword()));
        personClient.save(person);
    }
}
