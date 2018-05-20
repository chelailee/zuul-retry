package com.shghtd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author che
 * @date 2018-05-10 14:21
 */
@RestController
public class TestController {

    @Autowired
    Environment environment;

    @RequestMapping(path = "/query")
    public String query() {
        System.out.println("test"+environment.getProperty("spring.profiles"));
        return "test"+environment.getProperty("spring.profiles");
    }
}
