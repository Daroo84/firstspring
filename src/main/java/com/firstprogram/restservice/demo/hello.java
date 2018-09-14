package com.firstprogram.restservice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @Autowired
    @Qualifier("RegularWritter")
    TextWriter regular;

    @Autowired
    @Qualifier("fancyWriter")
    TextWriter fancy;


    @RequestMapping("/")
    public String index() {
        return regular.WriteText("Hi Erik");
        }


    }


