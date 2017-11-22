package com.example.demo;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testAnnotatedMethods(){
        Optional<String> result = demoService.testThis("test", Optional.empty());
    }

}