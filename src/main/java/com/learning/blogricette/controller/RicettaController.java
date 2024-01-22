package com.learning.blogricette.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RicettaController {

    @GetMapping
    public String index() {
        return "show";
    }


}
