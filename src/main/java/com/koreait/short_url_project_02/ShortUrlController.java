package com.koreait.short_url_project_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.util.List;

@Controller
public class ShortUrlController {

    private List<Surl> surls;

    @GetMapping("/add")
    @ResponseBody
    public String add(Spring url) {
        return "Hello World";
    }
}
