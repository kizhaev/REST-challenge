package com.kizhaevv.challenge.deutsche.service;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import com.kizhaevv.challenge.deutsche.ArrayUtil;
import com.kizhaevv.challenge.deutsche.domain.Address;
import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vasiliy Kizhaev
 */
@Service
public class GoogleMapsGeocodingService implements GeocodingService {

    @Autowired
    private GeoApiContext geoApiContext;

    @Override
    public Coordinates getCoordinatesForAddress(Address address) {
        try {
            GeocodingResult[] geocodingResults = GeocodingApi.geocode(geoApiContext, address.getPostCode()).await();
            LatLng location = geocodingResults[0].geometry.location;
            return new Coordinates(location.lat, location.lng);
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while obtaining geocoding for address '" + address + "'.", e);
        }
    }

    @Override
    public Coordinates getNearestCoordinates(Coordinates target, List<Coordinates> options) {
        if (options.size() == 0) {
            return null;
        }

        String[] destinations = options.stream().map(Object::toString).collect(Collectors.toList()).toArray(new String[options.size()]);
        try {
            DistanceMatrix distanceMatrix = DistanceMatrixApi.getDistanceMatrix(geoApiContext, new String[]{target.toString()}, destinations).await();
            int minIndex = ArrayUtil.findMinIndex(distanceMatrix.rows[0].elements, (o1, o2) -> (o1.duration == null || o2.duration == null) ? 0 : Long.compare(o1.duration.inSeconds, o2.duration.inSeconds));
            return options.get(minIndex);
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while searching for nearest point to '" + target + "'.", e);
        }
    }
}
