package com.example.Neuefische_Spring;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/api/hello")
public class ApiController {
    @GetMapping
    public String HelloWorld() {
        return "Hello, World!";
    }
}
