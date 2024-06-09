package me.sairu.starwars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import me.sairu.starwars.service.StarWarsService;
import me.sairu.starwars.model.PlanetsResponse;

@RestController
public class PlanetsController {

    private final StarWarsService starWarsService;

    public PlanetsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("/planets")
    public PlanetsResponse getPlanets() {
        return starWarsService.getPlanets();
    }
}