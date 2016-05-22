package com.kizhaevv.challenge.deutsche.controller;

import com.kizhaevv.challenge.deutsche.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Vasiliy Kizhaev
 */
@Controller
public class CustomerController {
    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    String getNearestShop(@RequestParam("long") String longitude, @RequestParam("lat") String latitude) {
        return null;
    }
}
