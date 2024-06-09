package me.sairu.starwars.model;

import lombok.Data;
import java.util.List;

@Data
public class StarshipsResponse {
    private int count;
    private String next;
    private String previous;
    private List<Starship> results;

    @Data
    public static class Starship {
        private String name;
        private String model;
        private String manufacturer;
        private String cost_in_credits;
        private String length;
        private String max_atmosphering_speed;
        private String crew;
        private String passengers;
        private String cargo_capacity;
        private String consumables;
        private String hyperdrive_rating;
        private String MGLT;
        private String starship_class;
        private List<String> pilots;
        private List<String> films;
        private String created;
        private String edited;
        private String url;
    }
}