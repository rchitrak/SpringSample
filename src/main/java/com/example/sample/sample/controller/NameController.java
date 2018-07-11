package com.example.sample.sample.controller;


import com.example.sample.sample.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {
    @Autowired
    private NameService nameService;

    @RequestMapping(value = "/first_name", method= RequestMethod.GET)
    public String Info1(){
        return "Rup";
    }
    @RequestMapping(value = "/last_name", method= RequestMethod.GET)
    public String Info2(){
        return "Chitrak";
    }
    @RequestMapping(value = "/name/{a}/{b}", method= RequestMethod.GET)
    public String Info2(@PathVariable String a,@PathVariable String b){
        return this.nameService.nservice(a,b);
    }
}
