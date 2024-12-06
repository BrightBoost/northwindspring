package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class ExampleBean {
    public ExampleBean(String message) {
        System.out.println(message);
    }
}
