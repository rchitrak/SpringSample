package com.example.sample.sample.controller;

import com.example.sample.sample.service.MultiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiController {
    @Autowired
    private MultiService multiService;

    @RequestMapping(value ="/multi",method= RequestMethod.GET)
    public String mul(@RequestParam int a,@RequestParam int b,@RequestParam int c){
        return this.multiService.multiply(a,b,c);
    }

}
