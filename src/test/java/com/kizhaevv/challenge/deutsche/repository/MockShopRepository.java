package com.kizhaevv.challenge.deutsche.repository;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import com.kizhaevv.challenge.deutsche.domain.Shop;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vasiliy Kizhaev
 */
@Repository
public class MockShopRepository implements ShopRepository {
    public Map<Shop, Coordinates> shops = new HashMap<>();

    @Override
    public Map<Shop, Coordinates> getAllShops() {
        return shops;
    }

    @Override
    public void addShop(Shop shop, Coordinates coordinates) {
        shops.put(shop, coordinates);
    }
}
