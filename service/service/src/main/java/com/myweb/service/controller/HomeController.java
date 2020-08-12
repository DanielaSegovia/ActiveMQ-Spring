package com.myweb.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class HomeController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public String index(){ 
        return "Hola Mundo"; 
    }
    
     
    @RequestMapping(value = "/", method = RequestMethod.POST) 
    public String store(){ 
        return "Hello world"; 
    }
     
    
}