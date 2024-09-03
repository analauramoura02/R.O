package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/cadAluno")
    public String cadAluno(Model model){
        model.addAttribute("aluno", new Aluno());
        return "aluno/cadAluno";
    }


}
