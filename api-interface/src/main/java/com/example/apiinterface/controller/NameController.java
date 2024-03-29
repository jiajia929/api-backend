package com.example.apiinterface.controller;

import com.example.apiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @PostMapping("/user")
    public String getUsername(@RequestBody User user) {
        return "你的名字是：" + user.getUsername();
    }
}
