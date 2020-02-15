package com.rahul.kuber1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Micgogi
 * on 2/14/2020  9:05 PM
 * Micgogi
 */
@RestController
public class MainController {
    @GetMapping
    public String hello(){
        return "Hello world this is micgogi!";
    }
}
