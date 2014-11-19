package com.hachiyae.spring.sandbox.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {
    public String hello(String world){
        return "hello " + world;
    }
}
