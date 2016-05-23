package com.kizhaevv.challenge.deutsche;

import com.kizhaevv.challenge.deutsche.config.FunctionalTestConfig;
import com.kizhaevv.challenge.deutsche.controller.CustomerController;
import com.kizhaevv.challenge.deutsche.controller.RetailManagerController;
import com.kizhaevv.challenge.deutsche.domain.Shop;
import com.kizhaevv.challenge.deutsche.repository.ShopRepository;
import com.kizhaevv.challenge.deutsche.util.ShopUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


/**
 * @author Vasiliy Kizhaev
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@ContextConfiguration(classes = {FunctionalTestConfig.class})
public class FunctionalTest {
    @Autowired
    private RetailManagerController retailManagerController;

    @Autowired
    private CustomerController customerController;

    @Autowired
    private ShopRepository shopRepository;

    @Before
    public void clearRepository() {
        shopRepository.clear();
    }

    @Test
    public void testInitialState() {
        assertEquals("CustomerController is expected to return null when no shops stored.", null,
                customerController.getNearestShop(55, 55));
    }

    @Test
    public void testOnlyShop() {
        Shop shop = ShopUtil.newShop("1", 1, "1");

        retailManagerController.addShop(shop);
        Shop nearestShop = customerController.getNearestShop(51, 51);

        assertEquals("The nearest shop is expected to be equal to the only shop added.", shop, nearestShop);
    }

    @Test
    public void testNearestShop() {
        Shop shop1 = ShopUtil.newShop("1", 1, "AB52 6LH");
        Shop shop2 = ShopUtil.newShop("2", 2, "CM9 5AF");

        retailManagerController.addShop(shop1);
        retailManagerController.addShop(shop2);
        Shop nearestShop = customerController.getNearestShop(57.345259, -2.609509);

        assertEquals("The nearest shop returned is expected to be equal to the actual nearest shop.", shop1, nearestShop);
    }
}
