package com.example.springbootdemo1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Hello {
    public void hello(){
        System.out.println("hello");
    }
}
