package com.yearup.springbootexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuckConfig {
    @Bean
    Duck myPrettyDuck() {
        Duck d = new Duck();
        d.setPretty(true);
        return new Duck();
    }

}
