package com.mubir.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/api/home")
    public String home()
    {
        return ("<h1>welcome home</h1>");
    }

    @GetMapping("/api/user")
    public String user()
    {
        return ("<h1>welcome user</h1>");
    }

    @GetMapping("/api/admin")
    public String admin()
    {
        return ("<h1>welcome admin</h1>");
    }
}
