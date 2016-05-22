package com.kizhaevv.challenge.deutsche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Vasiliy Kizhaev
 */
@EnableAutoConfiguration
@ComponentScan("com.kizhaevv.challenge.deutsche")
public class App {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
