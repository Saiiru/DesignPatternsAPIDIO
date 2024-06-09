package me.sairu.starwars.service;

import org.springframework.stereotype.Service;
import me.sairu.starwars.api.StarWarsApi;
import me.sairu.starwars.model.PeopleResponse;
import me.sairu.starwars.model.PlanetsResponse;
import me.sairu.starwars.model.StarshipsResponse;

@Service
public class StarWarsService {

    private final StarWarsApi starWarsApi;

    public StarWarsService(StarWarsApi starWarsApi) {
        this.starWarsApi = starWarsApi;
    }

    public PeopleResponse getPeople() {
        return starWarsApi.getPeople();
    }

    public PlanetsResponse getPlanets() {
        return starWarsApi.getPlanets();
    }


    public StarshipsResponse getStarships() {
        return starWarsApi.getStarships();
    }
}