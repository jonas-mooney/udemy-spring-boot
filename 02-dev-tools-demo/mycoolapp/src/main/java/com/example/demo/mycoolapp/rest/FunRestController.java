package com.example.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello Worldz!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Many good things are coming your way";
    }
}
