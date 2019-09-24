package org.geekjc.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年09月24日 5:23 PM
 */
@RestController
public class HelloController {
    @Autowired
    Book book;
    @GetMapping("/hello")
    public String hello() {
        System.out.println(book);
        return "hello, geekjc";
    }
}
