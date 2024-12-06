package com.pluralsight.NorthwindTradersSpringBoot.sub;

import com.pluralsight.NorthwindTradersSpringBoot.ExampleBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Blabla {
    private ExampleBean secondExampleBean;

    public Blabla(ExampleBean secondExampleBean) {
        this.secondExampleBean = secondExampleBean;
    }
}
