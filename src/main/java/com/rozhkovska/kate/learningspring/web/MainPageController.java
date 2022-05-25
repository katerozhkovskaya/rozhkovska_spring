package com.rozhkovska.kate.learningspring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainPageController {

    @GetMapping
    public String getGuests() {
        return "main";
    }
}