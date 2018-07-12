package com.example.sample.sample.repository;

import com.example.sample.sample.entities.Class;
import org.springframework.data.repository.CrudRepository;

public interface IClassRepository extends CrudRepository<Class,Integer> {
}