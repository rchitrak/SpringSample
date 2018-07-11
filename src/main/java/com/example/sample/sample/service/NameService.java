package com.example.sample.sample.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String nservice(String a,String b){
    String c = a+b;
    return "I am " +c;
    }
}
