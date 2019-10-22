package com.bangsacerdas.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestfulController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello From Controller";
    }
}
