package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {


    @Bean
    public String stringBean() {
        return "Hello! I'm a String Bean";
    }
}
