package com.softserve.museum.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/excursions")
public class ExcursionsController {
    
   
    @GetMapping()
    public String  onExursions() {        
        return "excursions/excursions";
    }
    
}
