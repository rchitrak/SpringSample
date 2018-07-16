package com.example.sample.sample.controller;

import com.example.sample.sample.entities.ClassStudents;
import com.example.sample.sample.entities.Students;
import com.example.sample.sample.service.ClassStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ClassStudentController {

    @Autowired
    private ClassStudentService classStudentService;

    @RequestMapping(value = "/class-students", method = RequestMethod.GET)
    public Iterable<ClassStudents> findAllClass(){
        return this.classStudentService.findAllClass();
    }
    @RequestMapping(value = "/class-students", method = RequestMethod.POST)
    public ClassStudents insert(@RequestBody ClassStudents classStudents){
        return this.classStudentService.insertclassStudent(classStudents);
    }
    @RequestMapping(value = "/class-students/{id}", method = RequestMethod.GET)
    public Optional<ClassStudents> findAllClass(@PathVariable int id){
        return this.classStudentService.findById(id);
    }
}
