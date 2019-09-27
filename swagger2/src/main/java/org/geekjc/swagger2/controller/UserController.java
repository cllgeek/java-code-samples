package org.geekjc.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.geekjc.swagger2.bean.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author ll
 * @date 2019年09月27日 9:59 AM
 */
@RestController
@Api(tags = "用户管理接口")
@RequestMapping("/user")
public class UserController {

    @ApiOperation("根据id查询用户")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99")
    @GetMapping("/")
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @ApiOperation("根据id更新用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99"),
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "geekjc")
    })
    @PutMapping("/")
    public User updateUsernameById(String username, Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }

    @PostMapping("/")
    @ApiOperation("添加用户")
    public User addUser(@RequestBody User user) {
        return user;
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id 删除用户")
    public void deleteUserById(@PathVariable Long id) {

    }

    @GetMapping("/hello")
    public String hello(String name) {
        return "hello " + name + " !";
    }
}
