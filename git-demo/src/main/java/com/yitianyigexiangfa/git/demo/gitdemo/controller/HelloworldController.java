package com.yitianyigexiangfa.git.demo.gitdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bill Lau
 * @date 2018-09-11
 */
@RestController
public class HelloworldController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hello world";
    }
}
