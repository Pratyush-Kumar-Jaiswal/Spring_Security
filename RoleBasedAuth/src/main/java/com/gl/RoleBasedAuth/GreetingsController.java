package com.gl.RoleBasedAuth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hiii";
    }

    @PreAuthorize("hasRole('user')")
    @GetMapping("/user")
    public String sayHelloUser(){
        return "Hello User";
    }

    @PreAuthorize("hasRole('admin')")
    @GetMapping("/admin")
    public String sayHelloAdmin(){
        return "Hello Admin";
    }
}