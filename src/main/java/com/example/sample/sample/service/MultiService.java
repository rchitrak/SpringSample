package com.example.sample.sample.service;

import org.springframework.stereotype.Service;

@Service
public class MultiService {

    public String multiply(int a, int b,int c) {
        int d = a * b * c;
        return "Multiplication is" + d;
    }
}