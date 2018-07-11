package com.example.sample.sample.service;

import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    public String sampleService(int a, int b){
        int c=a+b;
        return "Sum of number is "+c;
    }
}
