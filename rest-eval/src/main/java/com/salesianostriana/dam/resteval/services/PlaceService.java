package com.salesianostriana.dam.resteval.services;

import com.salesianostriana.dam.resteval.error.PlaceNotFoundException;
import com.salesianostriana.dam.resteval.models.Place;
import com.salesianostriana.dam.resteval.repositories.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepository repo;

    public List<Place> getAll() {
        if(repo.getAll().isEmpty()) {
            //throw new PlaceNotFoundException();
        } else {
            return repo.getAll();
        }
    }

    public Place get(Long id) {
        return repo.get(id).orElseThrow(() -> //PlaceNotFoundException())
    }

}
