package com.salesianostriana.dam.resteval.dto;

import com.salesianostriana.dam.resteval.models.Place;

public record PlaceDto(
        Long id,
        String nombre,
        String coords,
        String imagen
) {

    public PlaceDto toDto(Place p) {
        return new PlaceDto(
            p.getId(),
            p.getName(),
            p.getCoords(),
            p.getImage()
        );
    }

}
