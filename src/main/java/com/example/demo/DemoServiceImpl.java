package com.example.demo;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public Optional<String> testThis(
            String param1,
            Optional<String> param2) {
        return Optional.of("result");
    }
}
