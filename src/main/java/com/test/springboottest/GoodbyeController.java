package com.test.springboottest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GoodbyeController {

    @RequestMapping("/goodbye")
    public String index() {
        return "Goodbye from Spring Boot!";
    }

}
