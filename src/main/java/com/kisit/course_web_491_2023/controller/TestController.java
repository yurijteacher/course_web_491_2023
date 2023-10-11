package com.kisit.course_web_491_2023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

@GetMapping("/")
    public String getHome(){
    return "index";
}

}
