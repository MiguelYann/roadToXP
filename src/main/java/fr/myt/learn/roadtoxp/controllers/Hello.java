package fr.myt.learn.roadtoxp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

    @GetMapping("hello")
    public String getHello() {
        return "Hello ROAD PROJECT :)";
    }
}
