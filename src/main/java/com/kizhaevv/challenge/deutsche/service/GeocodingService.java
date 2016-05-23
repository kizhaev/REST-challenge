package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.domain.Address;
import com.kizhaevv.challenge.deutsche.domain.Coordinates;

import java.util.List;

/**
 * @author Vasiliy Kizhaev
 */
public interface GeocodingService {
    Coordinates getCoordinatesForAddress(Address address);

    Coordinates getNearestCoordinates(Coordinates target, List<Coordinates> options);
}
