package com.firstprogram.restservice.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("RegularWritter")
public class RegularWriter implements  TextWriter{
    public String WriteText(String s){
        return s.toUpperCase();

    }
}
