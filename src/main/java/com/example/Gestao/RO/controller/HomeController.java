package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Professor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("home", new Professor());
        return "home/inicio";

    }

}
