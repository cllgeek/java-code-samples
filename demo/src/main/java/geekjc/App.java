package geekjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ll
 * @date 2019年09月24日 4:29 PM
 */
@EnableAutoConfiguration
@RestController
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello, geekjc";
    }
}
