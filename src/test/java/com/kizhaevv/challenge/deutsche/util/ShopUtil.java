package com.kizhaevv.challenge.deutsche.util;

import com.kizhaevv.challenge.deutsche.domain.Address;
import com.kizhaevv.challenge.deutsche.domain.Coordinates;
import com.kizhaevv.challenge.deutsche.domain.Shop;

/**
 * @author Vasiliy Kizhaev
 */
public class ShopUtil {
    public static Shop newShop(String name, int number, String postCode) {
        Address address = new Address();
        address.setNumber(number);
        address.setPostCode(postCode);

        Shop shop = new Shop();
        shop.setShopName(name);
        shop.setShopAddress(address);

        return shop;
    }
}
