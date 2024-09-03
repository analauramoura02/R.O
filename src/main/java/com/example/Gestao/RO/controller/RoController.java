package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Ro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ro")
public class RoController {

    @GetMapping
    public String listagem(Model model){

        return "ro/listagem";
    }

    @GetMapping("/form-inserir")
    public String formInserir(Model model){
        model.addAttribute("ro", new Ro());

        return "ro/form-inserir";
    }

}
