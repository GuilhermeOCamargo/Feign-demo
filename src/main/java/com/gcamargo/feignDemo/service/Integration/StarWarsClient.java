package com.gcamargo.feignDemo.service.Integration;

import com.gcamargo.feignDemo.config.ClientConfig;
import com.gcamargo.feignDemo.model.Integration.PlanetResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@Component
@FeignClient(value = "starWars", url = "${starWars.url}", configuration = ClientConfig.class)
public interface StarWarsClient {

    @RequestMapping(method = GET, path = "/planets/")
    PlanetResponse getPlanets();

    @RequestMapping(method = GET, path = "/planets/?search={name}")
    PlanetResponse findPlanetByName(@PathVariable String name);
}
