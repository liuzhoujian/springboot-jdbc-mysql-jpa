package com.lzj.springbootjpa.controller;

import com.lzj.springbootjpa.dao.UserReposity;
import com.lzj.springbootjpa.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserReposity userReposity;

    @GetMapping("/query/{id}")
    public User queryUserById(@PathVariable("id") Integer id) {
        Optional<User> user = userReposity.findById(id);
        return user.get();
    }

    @PostMapping("/insert")
    public User insertUser(@RequestBody User user) {
        User res = userReposity.save(user);
        return res;
    }
}
