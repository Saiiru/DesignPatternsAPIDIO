package me.sairu.starwars.model;

import lombok.Data;

import java.util.List;

@Data
public class PlanetsResponse {
    private int count;
    private String next;
    private String previous;
    private List<Object> results;
}