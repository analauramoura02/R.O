package com.example.Gestao.RO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ficha")
public class FichaAluno {

    @GetMapping("/form-inserir")
    public String formInserir(){
        return "ficha/form-inserir";
    }
}
