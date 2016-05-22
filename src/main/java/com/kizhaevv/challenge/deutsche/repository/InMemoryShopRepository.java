package com.kizhaevv.challenge.deutsche.repository;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import com.kizhaevv.challenge.deutsche.domain.Shop;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @author Vasiliy Kizhaev
 */
@Repository
public class InMemoryShopRepository implements ShopRepository {
    @Override
    public Map<Shop, Coordinates> getAllShops() {
        return null;
    }

    @Override
    public void addShop(Shop shop, Coordinates coordinates) {

    }
}
