package com.glieen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Glieen
 * Date: 2018/2/4
 * Time: 23:58
 * Desc: 项目测试
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
