package org.javageekjc.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年09月25日 1:11 PM
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello https!";
    }
}
