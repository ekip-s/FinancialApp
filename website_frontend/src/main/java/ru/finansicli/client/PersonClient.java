package ru.finansicli.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.finansicli.models.Person;

@Component
public class PersonClient {

    private RestTemplate restTemplate = new RestTemplate();
    private final String url;


    public PersonClient(@Value("${server.backend.address}") String url) {
        this.url=url;
    }

    public Person findByUsername(String username) {
        try {
            return restTemplate.getForObject(url + "/person?username=" + username, Person.class);
        } catch (Throwable e) {
            throw new UsernameNotFoundException(e.getMessage());
        }
    }

    public void save(Person person) {
        restTemplate.postForObject(url + "/person", person, Person.class);
    }
}
