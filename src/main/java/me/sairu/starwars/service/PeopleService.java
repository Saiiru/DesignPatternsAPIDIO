package me.sairu.starwars.service;

import org.springframework.stereotype.Service;
import me.sairu.starwars.api.StarWarsApi;
import me.sairu.starwars.model.PeopleResponse;

@Service
public class PeopleService {

    private final StarWarsApi starWarsApi;

    public PeopleService(StarWarsApi starWarsApi) {
        this.starWarsApi = starWarsApi;
    }

    public PeopleResponse getPeople() {
        return starWarsApi.getPeople();
    }
}