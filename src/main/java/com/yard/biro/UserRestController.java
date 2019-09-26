package com.yard.biro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController{

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public User login (@RequestBody UserDTO userDTO){
        return null;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User insertNewUser(@RequestBody UserDTO userDto) {
        return userService.insertNewUser(userDto.getUser());
    }

}
