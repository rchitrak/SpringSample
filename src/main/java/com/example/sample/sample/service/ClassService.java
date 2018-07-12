package com.example.sample.sample.service;

import com.example.sample.sample.entities.Class;
import com.example.sample.sample.repository.IClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassService {

    @Autowired
    private IClassRepository classRepository;

    public Iterable<Class> findAllClass(){
        return  this.classRepository.findAll();
    }

    public Class saveClass(Class c){
       return this.classRepository.save(c);
    }

    public Optional<Class> findById(int id){
        return this.classRepository.findById(id);
    }



}
