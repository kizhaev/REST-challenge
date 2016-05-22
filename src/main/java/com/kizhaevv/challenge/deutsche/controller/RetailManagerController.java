package com.kizhaevv.challenge.deutsche.controller;

import com.kizhaevv.challenge.deutsche.domain.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Vasiliy Kizhaev
 */
@Controller
public class RetailManagerController {


    @RequestMapping(value = "/shop", method = RequestMethod.PUT)
    public String addShop(@RequestBody Shop shop) {
        return null;
    }
}