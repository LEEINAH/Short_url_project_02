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
        return "자동배포 테스트";
    }

}