package com.toy.first_project.controller.session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {

    @GetMapping("/login")
    public String login(){

        return "session/login";
    }

    @GetMapping("/forgot")
    public String forgot(){

        return "session/forgot-password";
    }

    @GetMapping("/register")
    public String register(){

        return "session/register";
    }

    @RequestMapping("/check")
    public void check(){

        System.out.println("check");

    }
}
