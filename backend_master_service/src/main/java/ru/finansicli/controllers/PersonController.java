package ru.finansicli.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.finansicli.models.Person;
import ru.finansicli.services.PersonService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void savePerson(@RequestBody Person person) {
        personService.savePerson(person);
    }

    @GetMapping
    public Person getPersonOfLogin(@RequestParam String username) {
        return personService.getPersonByLogin(username);
    }

    @GetMapping("/admin")
    public Person getPersonById(@RequestParam Long id) {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/admin")
    public void deletePersonById(@RequestParam Long id) {
        personService.deletePersonById(id);
    }
}
