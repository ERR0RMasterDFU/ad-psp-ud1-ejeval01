package com.salesianostriana.dam.resteval.controllers;

import com.salesianostriana.dam.resteval.models.Place;
import com.salesianostriana.dam.resteval.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place/")
public class PlaceController {

    @Autowired
    private PlaceService serv;

    @GetMapping("")
    public List<Place> getAllPlaces() {
        return serv.getAll();
    }

    @GetMapping("{id}")
    public Place getPlaceById(@PathVariable Long id) {
        return serv.get(id);
    }

    //@PostMapping

}
