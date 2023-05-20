package ru.finansicli.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/hello")
    public  String sayHello() {
        return "hello";
    }

    @GetMapping("/")
    public String infoPage() {
        return "info";
    }
}
