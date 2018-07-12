package com.example.sample.sample.controller;

import com.example.sample.sample.entities.Class;
import com.example.sample.sample.entities.Students;
import com.example.sample.sample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Iterable<Students> findAllClass(){
        return this.studentService.findAllClass();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public Students insert(@RequestBody Students students){
        return this.studentService.insertStudent(students);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Optional<Students>findAllClass(@PathVariable int id){
        return this.studentService.findById(id);
    }

    @RequestMapping(value = "/findByAge/{age}", method = RequestMethod.GET)
    public List<Students> findByAge(@PathVariable int age){
        return this.studentService.findByAge(age);
    }

    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
    public Students findByName(@PathVariable String name){
        return this.studentService.findByName(name);
    }

}
