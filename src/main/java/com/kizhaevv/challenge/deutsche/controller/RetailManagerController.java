package com.kizhaevv.challenge.deutsche.controller;

import com.kizhaevv.challenge.deutsche.domain.Shop;
import com.kizhaevv.challenge.deutsche.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Vasiliy Kizhaev
 */
@Controller
public class RetailManagerController {

    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/shop", method = RequestMethod.PUT)
    public void addShop(@RequestBody Shop shop) {
        shopService.addShop(shop);
    }
}