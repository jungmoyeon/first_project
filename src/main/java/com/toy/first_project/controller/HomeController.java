package com.toy.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.logging.log4j.Logger.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // service 에 표현할 데이터
        // teams 에 표현할 데이터
        // ㅇㅇㅇㅇ
        return "main_view/index";
    }

}
