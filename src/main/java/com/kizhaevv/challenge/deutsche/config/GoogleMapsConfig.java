package com.kizhaevv.challenge.deutsche.config;

import com.google.maps.GeoApiContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Vasiliy Kizhaev
 */
@Configuration
@PropertySource("google.properties")
public class GoogleMapsConfig {
    @Autowired
    private Environment environment;

    @Bean
    public GeoApiContext geoApiContext() {
        String key = environment.getProperty("key");
        if (key == null) {
            throw new RuntimeException("Google Service API key must be set in 'google.properties' file.");
        }
        return new GeoApiContext().setApiKey(key);
    }
}
