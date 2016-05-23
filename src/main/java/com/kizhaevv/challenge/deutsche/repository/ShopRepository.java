package com.kizhaevv.challenge.deutsche.repository;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import com.kizhaevv.challenge.deutsche.domain.Shop;

import java.util.Map;

/**
 * @author Vasiliy Kizhaev
 */
public interface ShopRepository {
    Map<Shop, Coordinates> getAllShops();

    void addShop(Shop shop, Coordinates coordinates);

    Shop getShopByCoordinates(Coordinates coordinates);

    void clear();
}
