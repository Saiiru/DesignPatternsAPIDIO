package me.sairu.starwars.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import me.sairu.starwars.service.StarWarsService;
import me.sairu.starwars.model.StarshipsResponse;

@RestController
public class StarshipsController {

    private final StarWarsService starWarsService;

    public StarshipsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping("/starships")
    public StarshipsResponse getStarships() {
        return starWarsService.getStarships();
    }
}