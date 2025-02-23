package com.springPractice.springFlux.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleRestContrller {
    
    @RequestMapping("/") 
        public String hello(){
            return "Hello Flux!";
    }
}
