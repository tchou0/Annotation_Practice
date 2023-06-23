package com.yearup.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component   // look at me i am a bean --- important class
public class SayHello implements CommandLineRunner {

    @Autowired   // injecting it using Autowired
    Cow c ;

    @Autowired
    Cow c2;

    @Autowired
    Duck d;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
//      c = new Cow();         // Because of the @Autowired, we dont need this code anymore
        c.speak();
        c2.speak();
        d.speak();
    }
}
