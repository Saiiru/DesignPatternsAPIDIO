package me.sairu.starwars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import me.sairu.starwars.service.StarWarsService;
import me.sairu.starwars.model.PeopleResponse;

@RestController
public class PeopleController {

    private final StarWarsService starWarsService;

    public PeopleController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("/people")
    public PeopleResponse getPeople() {
        return starWarsService.getPeople();
    }
}