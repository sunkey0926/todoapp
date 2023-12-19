package com.example.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello"; // hello.html 을 요청 >> 템플릿 엔진때문에 [.html]은 생략 가능.
    }
}
