package com.kizhaevv.challenge.deutsche.controller;

import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import com.kizhaevv.challenge.deutsche.domain.Shop;
import com.kizhaevv.challenge.deutsche.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

/**
 * @author Vasiliy Kizhaev
 */
@Controller
public class CustomerController {
    @Autowired
    private ShopService shopService;

    @RequestMapping(value = "/shop/{lng}/{lat}", method = RequestMethod.GET)
    @ResponseBody
    public Shop getNearestShop(@PathParam("lng") double longitude, @PathParam("lat") double latitude) {
        return shopService.getNearestShop(new Coordinates(latitude, longitude));
    }
}
