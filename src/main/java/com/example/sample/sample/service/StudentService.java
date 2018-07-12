package com.example.sample.sample.service;

import com.example.sample.sample.entities.Class;
import com.example.sample.sample.entities.Students;
import com.example.sample.sample.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository studentRepository;


    public Iterable<Students> findAllClass(){
        return this.studentRepository.findAll();
    }

    public Students insertStudent(Students student){
        return this.studentRepository.save(student);
    }

//    public Class saveClass(Class c){
//        return this.studentRepository.save(c);
//    }
//
    public Optional<Students> findById(int id){
        return this.studentRepository.findById(id);
    }

    public List<Students> findByAge(int age){
        return this.studentRepository.findByAge(age);
    }

    public Students findByName(String name){
        return this.studentRepository.findByName(name);
    }

}
