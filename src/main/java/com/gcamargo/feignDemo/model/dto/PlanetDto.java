package com.gcamargo.feignDemo.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class PlanetDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    private Long id;
    private String name;
    @JsonIgnore
    private String rotation_period;
    @JsonIgnore
    private String orbital_period;
    @JsonIgnore
    private String diameter;
    private String climate;
    @JsonIgnore
    private String gravity;
    private String terrain;
    @JsonIgnore
    private String surface_water;
    @JsonIgnore
    private String population;
    @JsonIgnore
    private List<String> residents;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<String> films;
    @JsonIgnore
    private String created;
    @JsonIgnore
    private String edited;
    @JsonIgnore
    private String url;
    private int quantity_movies;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getClimate() {
        return climate;
    }

    public String getGravity() {
        return gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public String getPopulation() {
        return population;
    }

    public List<String> getResidents() {
        return residents;
    }

    public List<String> getFilms() {
        return films;
    }

    public String getCreated() {
        return created;
    }

    public String getEdited() {
        return edited;
    }

    public String getUrl() {
        return url;
    }

    public int getQuantity_movies() {
        return quantity_movies;
    }
}