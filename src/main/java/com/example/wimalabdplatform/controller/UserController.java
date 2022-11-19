package com.example.wimalabdplatform.controller;

import com.example.wimalabdplatform.entity.Users;
import com.example.wimalabdplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initUserRolesAndUser() {
        userService.initUserRolesAndUser();
    }

    @GetMapping(path = "/h")
    public String h() {
        return "h";
    }

    @PostMapping({"/createNewUser"})
    public Users createNewUser(@RequestBody Users user) {
        return this.userService.createNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    public String forAdmin() {
        return "This is Admin Method";
    }

    @GetMapping({"/forUser"})
    public String forUser() { return "This is User Method."; }
}
