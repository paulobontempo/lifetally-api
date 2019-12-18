package com.bontempo.lifetally.api.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloResource {

    @RequestMapping("/")
    public String index() {
        return "<h1>Lifetally-api</h1>";
    }
}
