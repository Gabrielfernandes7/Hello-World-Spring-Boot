package com.hello.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Notação que indica que nossa classe é um controller web que aceita requisições
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String HelloWorld() {
        return "Hello mundo, essa endpoint funciona";
    }

    @GetMapping("/ola")
	public String olaComNome(@RequestParam(value = "name", defaultValue = "world") String name) {
		return String.format("Ola %s", name);
	}
}
