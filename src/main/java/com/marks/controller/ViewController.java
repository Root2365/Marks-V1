package com.marks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class ViewController {

    @GetMapping(value = {"/", "/login"})
    public String showLoginForm() {
        return "/login";
    }

    @GetMapping(value = "/marks")
    public String books(Model model) {
        return "marks";
    }
}
