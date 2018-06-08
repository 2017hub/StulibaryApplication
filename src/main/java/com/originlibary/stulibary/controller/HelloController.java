package com.originlibary.stulibary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHello(){
        System.out.println("------------->开始执行");
        return "hello--->world";
    }
}
