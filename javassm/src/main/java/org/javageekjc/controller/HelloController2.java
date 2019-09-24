package org.javageekjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ll
 * @date 2019年09月24日 11:41 AM
 */
@Controller
public class HelloController2 {
    @GetMapping("/hello2")
    public String hello() {
        return "hello";
    }
}
