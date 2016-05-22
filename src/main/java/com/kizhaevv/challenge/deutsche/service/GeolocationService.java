package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;

import java.util.List;

/**
 * @author Vasiliy Kizhaev
 */
public interface GeolocationService {
    Coordinates getCoordinatesForAddress(String address);

    int getNearestPointIndex(Coordinates target, List<Coordinates> options);
}
