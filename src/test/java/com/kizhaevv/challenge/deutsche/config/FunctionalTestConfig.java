package com.kizhaevv.challenge.deutsche.config;

import com.kizhaevv.challenge.deutsche.repository.MockShopRepository;
import com.kizhaevv.challenge.deutsche.repository.ShopRepository;
import com.kizhaevv.challenge.deutsche.service.GeolocationService;
import com.kizhaevv.challenge.deutsche.service.GoogleMapsGeolocationService;
import com.kizhaevv.challenge.deutsche.service.MockGeolocationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vasiliy Kizhaev
 */
@Configuration
@ComponentScan("com.kizhaevv.challenge.deutsche")
public class FunctionalTestConfig {
    @Bean
    public ShopRepository shopRepository() {
        return new MockShopRepository();
    }

    @Bean
    public GeolocationService geolocationService() {
        return new GoogleMapsGeolocationService();
    }
}
