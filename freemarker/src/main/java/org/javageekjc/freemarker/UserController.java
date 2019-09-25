package org.javageekjc.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ll
 * @date 2019年09月25日 4:47 PM
 */
@Controller
public class UserController {
    @GetMapping("/index")
    public String index(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("javageekjc>>>>" + i);
            user.setAddress("www.javageekjc.org>>>>" + i);
            users.add(user);
        }
        model.addAttribute("users", users);
        return "index";
    }
}
