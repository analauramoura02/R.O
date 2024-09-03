package com.example.Gestao.RO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/cadAluno")
    public String cadAluno(){
        return "aluno/cadAluno";
    }
}
