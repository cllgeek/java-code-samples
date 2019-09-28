package org.geekjc.sessionshare;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author ll
 * @date 2019年09月28日 10:33 AM
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    Integer port;

    @GetMapping("/set")
    public String set(HttpSession session) {
        session.setAttribute("user", "geekjc");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String get(HttpSession session) {
        return session.getAttribute("user") + ":" + port;
    }
}
