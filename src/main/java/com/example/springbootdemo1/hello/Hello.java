package com.example.springbootdemo1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    @RequestMapping("/hello1")
    public void hello(){
        System.out.println("hello world");
    }

    @RequestMapping("/say")
    public void say(){
        System.out.println("say...");
    }
}
