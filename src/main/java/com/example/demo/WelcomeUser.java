package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class WelcomeUser {

    @GetMapping("/hello-aws")
    public String welcome(){
        return "Welcome to AWS!";
    }

    @GetMapping("/welcome-jarvis")
    public String jarvis(){
        return "Github has access to AWS, Sir";
    }

}
