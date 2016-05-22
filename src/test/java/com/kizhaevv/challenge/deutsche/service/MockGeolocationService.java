package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Vasiliy Kizhaev
 */
@Service
public class MockGeolocationService implements GeolocationService {
    @Override
    public Coordinates getCoordinatesForAddress(String address) {
        return new Coordinates(address, address);
    }

    @Override
    public int getNearestPointIndex(Coordinates target, List<Coordinates> options) {
        return 0;
    }
}
