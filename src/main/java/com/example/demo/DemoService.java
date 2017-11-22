package com.example.demo;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

@Validated
public interface DemoService {

    Optional<String> testThis(@NotNull String param1, @NotNull Optional<String> param2);
}
