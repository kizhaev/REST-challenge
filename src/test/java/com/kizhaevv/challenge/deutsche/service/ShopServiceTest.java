package com.kizhaevv.challenge.deutsche.service;

import com.kizhaevv.challenge.deutsche.config.UnitTestConfig;
import com.kizhaevv.challenge.deutsche.domain.Shop;
import com.kizhaevv.challenge.deutsche.repository.ShopRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.kizhaevv.challenge.deutsche.util.ShopUtil.newShop;
import static org.junit.Assert.assertEquals;

/**
 * @author Vasiliy Kizhaev
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@ContextConfiguration(classes = {UnitTestConfig.class})
public class ShopServiceTest {

    @Autowired
    private ShopService shopService;

    @Autowired
    private ShopRepository shopRepository;

    @Test
    public void testInitialState() {
        assertEquals("Initially there must be no shops.", 0, shopRepository.getAllShops().size());
    }

    @Test
    public void testOneShopAdded() {
        Shop shop1 = newShop("1", 1, "1");

        shopService.addShop(shop1);

        assertEquals("The shop quantity is expected to be equal to the added quantity.",
                1, shopRepository.getAllShops().size());
        assertEquals("The stored shop is expected to be equal to the added one.",
                shop1, shopRepository.getAllShops().keySet().stream().findAny().get());
    }

    @Test
    public void testTwoDifferentShopsAdded() throws Exception {
        Shop shop1 = newShop("1", 1, "1");
        Shop shop2 = newShop("2", 2, "2");

        shopService.addShop(shop1);
        shopService.addShop(shop2);

        assertEquals("The shop quantity is expected to be equal to the added quantity.",
                2, shopRepository.getAllShops().size());
        List<Shop> allShops = new ArrayList<>();
        allShops.addAll(shopRepository.getAllShops().keySet());
        Collections.sort(allShops, (s1, s2) -> s1.getShopName().compareTo(s2.getShopName()));

        assertEquals("The stored shop is expected to be equal to the added one.", shop1, allShops.get(0));
        assertEquals("The stored shop is expected to be equal to the added one.", shop2, allShops.get(1));
    }

    @Test(expected = NullPointerException.class)
    public void testAddedNull() {
        shopService.addShop(null);
    }

}