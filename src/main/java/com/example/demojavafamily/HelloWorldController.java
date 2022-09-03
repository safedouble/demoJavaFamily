package com.example.demojavafamily;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhujian
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }
}
