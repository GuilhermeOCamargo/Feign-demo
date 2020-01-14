package com.gcamargo.feignDemo.service;

import com.gcamargo.feignDemo.exception.NotFoundException;
import com.gcamargo.feignDemo.model.dto.PlanetResponseDto;
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
        PlanetResponseDto planetResponseDto = starWarsClient.getPlanets();
        validatePlanetResponse(planetResponseDto);
        return planetResponseDto.getResults();
    }
    public PlanetDto findPlanetByName(String name){
        PlanetResponseDto planetResponseDto = starWarsClient.findPlanetByName(name);
        validatePlanetResponse(planetResponseDto);
        return planetResponseDto.getResults().get(0);
    }

    private void validatePlanetResponse(PlanetResponseDto planetResponseDto){
        if(planetResponseDto.getCount() == 0){
            throw new NotFoundException("Nenhum planeta encontrado");
        }
    }
}