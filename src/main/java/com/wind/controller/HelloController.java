package com.wind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 该注解等于 controller + @Responsebody的合体
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello () {
        return "hello world";
    }
}

