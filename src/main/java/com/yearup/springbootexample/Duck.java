package com.yearup.springbootexample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Duck {
    private boolean pretty = false;

    public void speak() {
        if (pretty)
            System.out.println("Quack, Quack, I feel great!");
        else
            System.out.println("Quack, Quack, I may not be pretty but I will not vent my rage on the world!");

    }

    public void setPretty(boolean pretty) {
        this.pretty = pretty;
    }
}
