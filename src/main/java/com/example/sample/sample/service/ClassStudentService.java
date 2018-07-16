package com.example.sample.sample.service;

import com.example.sample.sample.entities.ClassStudents;
import com.example.sample.sample.entities.Students;
import com.example.sample.sample.repository.IClassStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassStudentService {

    @Autowired
    private IClassStudentRepository classStudentRepository;

    public Iterable<ClassStudents> findAllClass(){
        return this.classStudentRepository.findAll();
    }

    public ClassStudents insertclassStudent(ClassStudents classstudent){
        return this.classStudentRepository.save(classstudent);
    }

    public Optional<ClassStudents> findById(int id){
        return this.classStudentRepository.findById(id);
    }
}
