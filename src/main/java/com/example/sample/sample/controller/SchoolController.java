package com.example.sample.sample.controller;

import com.example.sample.sample.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sample(){
        return "hello........";
    }

    @RequestMapping(value = "/rup", method = RequestMethod.GET)
    public String sample2(){
        return "I am rup chitrak";
    }

    @RequestMapping(value = "/sum", method = RequestMethod.GET)
    public String sum(@RequestParam int a, @RequestParam int b){
       return this.schoolService.sampleService(a,b);
    }

}
