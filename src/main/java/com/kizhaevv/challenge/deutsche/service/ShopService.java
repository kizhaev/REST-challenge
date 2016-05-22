package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Vasiliy Kizhaev
 */
@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;
}
