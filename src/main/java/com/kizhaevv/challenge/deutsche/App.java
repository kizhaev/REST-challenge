package com.kizhaevv.challenge.deutsche;

import com.kizhaevv.challenge.deutsche.controller.RetailManagerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author Vasiliy Kizhaev
 */
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
