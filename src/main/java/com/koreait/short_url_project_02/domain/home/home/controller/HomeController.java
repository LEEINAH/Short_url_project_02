package com.koreait.short_url_project_02.domain.home.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    private String secretKey;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Main Page 제발 띄워줄래??";
    }

}