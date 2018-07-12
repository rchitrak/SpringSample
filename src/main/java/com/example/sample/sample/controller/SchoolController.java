package com.example.sample.sample.controller;

import com.example.sample.sample.entities.Class;
import com.example.sample.sample.service.ClassService;
import com.example.sample.sample.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private ClassService classService;

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

    @RequestMapping(value = "/class", method = RequestMethod.GET)
    public Iterable<Class> findAllClass(){
        return this.classService.findAllClass();
    }
    @RequestMapping(value = "/class", method = RequestMethod.POST)
    public Class save(@RequestBody Class c){
        return this.classService.saveClass(c);
    }

    @RequestMapping(value = "/find-class/{id}", method = RequestMethod.GET)
    public Optional<Class> findAllClass(@PathVariable int id){
        return this.classService.findById(id);
    }

}
