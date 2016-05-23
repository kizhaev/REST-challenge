package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.domain.Address;
import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author Vasiliy Kizhaev
 */
@Service
public class MockGeocodingService implements GeocodingService {
    @Override
    public Coordinates getCoordinatesForAddress(Address address) {
        return new Coordinates(address.getNumber(), address.getNumber());
    }

    @Override
    public Coordinates getNearestCoordinates(Coordinates target, List<Coordinates> options) {
        return options.get(0);
    }
}
