package com.hachiyae.spring.sandbox.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class IndexServiceTest {
    IndexService test = new IndexService();

    @Test
    public void test(){
        assertEquals(test.hello("world"), "hello world");
    }
}