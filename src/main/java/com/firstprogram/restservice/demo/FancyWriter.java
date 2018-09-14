package com.firstprogram.restservice.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fancyWriter")
public class FancyWriter implements TextWriter {

    public String WriteText (String s){
        return s + " fancy Text";
    }
}
