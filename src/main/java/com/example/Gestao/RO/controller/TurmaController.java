package com.example.Gestao.RO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/turma")
public class TurmaController {

    @GetMapping("/form-inserir")
    public String formInserir(){
        return "turma/form-inserir";
    }


}
