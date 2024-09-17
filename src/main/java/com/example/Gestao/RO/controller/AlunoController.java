package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Aluno;
import com.example.Gestao.RO.model.EnderecoPessoa;
import com.example.Gestao.RO.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/inserir")
    public String inserir(Model model){
        model.addAttribute("aluno", new Aluno());

        model.addAttribute("endereco", new EnderecoPessoa());

        return "aluno/inserir";


    }





}
