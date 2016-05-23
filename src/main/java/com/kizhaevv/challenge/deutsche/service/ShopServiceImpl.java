package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import com.kizhaevv.challenge.deutsche.domain.Shop;
import com.kizhaevv.challenge.deutsche.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Vasiliy Kizhaev
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private GeocodingService geocodingService;

    @Override
    public void addShop(Shop shop) {
        Coordinates coordinates = geocodingService.getCoordinatesForAddress(shop.getShopAddress());
        shop.setShopCoordinates(coordinates);
        shopRepository.addShop(shop);
    }

    @Override
    public Shop getNearestShop(Coordinates coordinates) {
        List<Coordinates> values = new ArrayList<>(shopRepository.getAllShops().values());
        Coordinates nearestCoordinates = geocodingService.getNearestCoordinates(coordinates, values);
        return nearestCoordinates == null ? null : shopRepository.getShopByCoordinates(nearestCoordinates);
    }
}
