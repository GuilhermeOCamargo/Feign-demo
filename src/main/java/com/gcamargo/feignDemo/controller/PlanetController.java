package com.gcamargo.feignDemo.controller;

import com.gcamargo.feignDemo.model.dto.PlanetDto;
import com.gcamargo.feignDemo.service.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planets")
public class PlanetController {

    @Autowired
    private StarWarsService service;

    @GetMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<PlanetDto> getPlanets(){
        return service.getPlanets();
    }
    @GetMapping("/search")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public PlanetDto findPlanetByName(@RequestParam(name = "name") String name){
        return service.findPlanetByName(name);
    }
}