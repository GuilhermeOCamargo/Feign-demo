package com.gcamargo.feignDemo.service.Integration;

import com.gcamargo.feignDemo.config.ClientConfig;
import com.gcamargo.feignDemo.model.dto.PlanetResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@Component
@FeignClient(value = "${integration.starWars.value}", url = "${integration.starWars.url}", configuration = ClientConfig.class)
public interface StarWarsClient {

    @RequestMapping(method = GET, path = "/planets/")
    PlanetResponseDto getPlanets();

    @RequestMapping(method = GET, path = "/planets/?search={name}")
    PlanetResponseDto findPlanetByName(@PathVariable String name);
}
