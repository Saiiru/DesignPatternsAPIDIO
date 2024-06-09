package me.sairu.starwars.api;

import me.sairu.starwars.model.PeopleResponse;
import me.sairu.starwars.model.PlanetsResponse;
import me.sairu.starwars.model.StarshipsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "starwars", url = "https://swapi.dev/api/")
public interface StarWarsApi {

    @GetMapping("/people")
    PeopleResponse getPeople();

    @GetMapping("/planets")
    PlanetsResponse getPlanets();

    @GetMapping("/starships")
    StarshipsResponse getStarships();
}