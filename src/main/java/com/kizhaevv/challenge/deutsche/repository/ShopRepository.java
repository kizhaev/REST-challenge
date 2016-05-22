package com.kizhaevv.challenge.deutsche.repository;

import com.kizhaevv.challenge.deutsche.domain.Shop;

import java.util.Set;

/**
 * @author Vasiliy Kizhaev
 */
public interface ShopRepository {
    Set<Shop> getAllShops();

    void addShop(Shop shop);
}
