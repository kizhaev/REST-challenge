package com.kizhaevv.challenge.deutsche.controller;

import com.kizhaevv.challenge.deutsche.domain.Shop;
import com.kizhaevv.challenge.deutsche.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Vasiliy Kizhaev
 */
@Controller
public class RetailManagerController {

    @Autowired
    private ShopService shopService;

    /**
     * Stores the provided shop
     * @param shop Shop description in JSON format, e.g.
     *             <pre>
     *             {@code
     *{
     *                "shopName":"first",
     *                "shopAddress": {
     *                  "number":1,
     *                  "postCode":"CM9 5AF"
     *                 }
     *              }
     *              }
     *             </pre>
     */
    @RequestMapping(value = "/shop", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void addShop(@RequestBody Shop shop) {
        shopService.addShop(shop);
    }
}