package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.domain.Shop;
import com.kizhaevv.challenge.deutsche.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vasiliy Kizhaev
 */
@Service
public interface ShopService {
    void addShop(Shop shop);

    Shop getNearestShop(String longitude, String latitude);
}
