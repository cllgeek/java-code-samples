package org.geekjc.jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年09月28日 3:24 PM
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello jwt !";
    }
    @GetMapping("/admin")
    public String admin() {
        return "hello admin !";
    }
}
