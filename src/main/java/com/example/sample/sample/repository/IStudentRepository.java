package com.example.sample.sample.repository;

import com.example.sample.sample.entities.Students;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IStudentRepository extends CrudRepository<Students,Integer> {

    String sql1 = "select * from students where age>?1";
    @Query(value = sql1, nativeQuery = true)
    List<Students> findByAge(int age);

    Students findByName(String name);

}

