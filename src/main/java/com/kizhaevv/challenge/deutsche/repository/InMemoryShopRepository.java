package com.kizhaevv.challenge.deutsche.repository;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import com.kizhaevv.challenge.deutsche.domain.Shop;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Vasiliy Kizhaev
 */
@Repository
public class InMemoryShopRepository implements ShopRepository {

    private final Map<Shop, Coordinates> coordinatesByShop = new ConcurrentHashMap<>();
    private final Map<Coordinates, Shop> shopByCoordinates = new ConcurrentHashMap<>();

    @Override
    public Map<Shop, Coordinates> getAllShops() {
        return Collections.unmodifiableMap(coordinatesByShop);
    }

    @Override
    public void addShop(Shop shop) {
        coordinatesByShop.put(shop, shop.getShopCoordinates());
        shopByCoordinates.put(shop.getShopCoordinates(), shop);
    }

    @Override
    public Shop getShopByCoordinates(Coordinates coordinates) {
        return shopByCoordinates.get(coordinates);
    }

    @Override
    public void clear() {
        coordinatesByShop.clear();
        shopByCoordinates.clear();
    }
}
