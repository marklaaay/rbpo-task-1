package ru.student.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/number")
    public int number() {
        return 676767;
    }
}