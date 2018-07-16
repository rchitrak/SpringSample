package com.example.sample.sample.repository;

import com.example.sample.sample.entities.ClassStudents;
import org.springframework.data.repository.CrudRepository;

public interface IClassStudentRepository extends CrudRepository<ClassStudents, Integer> {
}
