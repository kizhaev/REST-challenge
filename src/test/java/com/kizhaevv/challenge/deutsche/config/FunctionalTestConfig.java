package com.kizhaevv.challenge.deutsche.config;

import com.kizhaevv.challenge.deutsche.repository.InMemoryShopRepository;
import com.kizhaevv.challenge.deutsche.repository.ShopRepository;
import com.kizhaevv.challenge.deutsche.service.GeocodingService;
import com.kizhaevv.challenge.deutsche.service.GoogleMapsGeocodingService;
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
        return new InMemoryShopRepository();
    }

    @Bean
    public GeocodingService geocodingService() {
        return new GoogleMapsGeocodingService();
    }
}
