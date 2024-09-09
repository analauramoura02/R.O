package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Ro;
import com.example.Gestao.RO.model.Turma;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CadTurmas")
public class CadastroTurmaController {

    @GetMapping
    public String listagem(Model model) {

        return "CadTurmas/listagem";
    }

    @GetMapping("/form-inserir")
    public String formInserir(Model model) {
        model.addAttribute("turma", new Turma());

        return "CadTurmas/form-inserir";

    }
}



