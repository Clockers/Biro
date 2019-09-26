package com.yard.biro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserRestController{

    @PostMapping("/login")
    public User login (@RequestBody UserDTO userDTO){
        return new User();
    }
}
