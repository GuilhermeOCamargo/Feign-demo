package com.gcamargo.feignDemo.service;

import com.gcamargo.feignDemo.exception.NotFoundException;
import com.gcamargo.feignDemo.model.Integration.PlanetResponse;
import com.gcamargo.feignDemo.model.dto.PlanetDto;
import com.gcamargo.feignDemo.service.Integration.StarWarsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarWarsService {

    @Autowired
    private StarWarsClient starWarsClient;

    public List<PlanetDto> getPlanets(){
        PlanetResponse planetResponse = starWarsClient.getPlanets();
        validatePlanetResponse(planetResponse);
        return planetResponse.getResults();
    }
    public PlanetDto findPlanetByName(String name){
        PlanetResponse planetResponse = starWarsClient.findPlanetByName(name);
        validatePlanetResponse(planetResponse);
        return planetResponse.getResults().get(0);
    }

    private void validatePlanetResponse(PlanetResponse planetResponse){
        if(planetResponse.getCount() == 0){
            throw new NotFoundException("Nenhum planeta encontrado");
        }
    }
}