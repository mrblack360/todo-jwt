package maswi.test.todojwt.controllers;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maswi.test.todojwt.models.Route;
import maswi.test.todojwt.models.RoutesDescription;

@RequestMapping("/")
@RestController
public class MainController {
    RoutesDescription routesDescription = new RoutesDescription();

    @Bean
    @GetMapping
    public ResponseEntity<List<Route>> routes() {
        return ResponseEntity.ok(routesDescription.routes);
    }

}
