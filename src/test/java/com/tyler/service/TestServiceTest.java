package com.tyler.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class TestServiceTest {

    @InjectMocks
    private TestService testService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testAdd() {
        int a = 1;
        int b = 2;
        int result = testService.add(a, b);
        assertEquals(3,result);
    }

}