package com.kizhaevv.challenge.deutsche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Vasiliy Kizhaev
 */
@Controller
public class RetailManagerController {


    @RequestMapping(value = "/shop", method = RequestMethod.PUT)
    String addShop() {
        return null;
    }
}