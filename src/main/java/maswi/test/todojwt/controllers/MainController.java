package maswi.test.todojwt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maswi.test.todojwt.models.Route;
import maswi.test.todojwt.models.RoutesDescription;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/")
@RestController
public class MainController {
    RoutesDescription routesDescription = new RoutesDescription();

    @Bean
    @GetMapping
    public String routes() {
        return "{\"Kimeumana\":\"Kimeumana tena\"}";
    }

}
