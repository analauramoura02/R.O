package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Aluno;
import com.example.Gestao.RO.repository.AlunoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public String listagem(Model model){
        model.addAttribute("alunos", alunoRepository.findAll());
        return "aluno/listagem";
    }


    // Carrega o form-inserir.html
    @GetMapping("/form-inserir")
    public String formInserir(Model model){

        model.addAttribute("aluno", new Aluno());
        return "aluno/form-inserir";

    }

    // Método para salvar o jogador
    @PostMapping("/salvar")
    public String salvar(
            @Valid Aluno aluno,
            BindingResult result,
            RedirectAttributes redirectAttributes){

        // Verifica se há erros de validação
        if(result.hasErrors()){
            return "aluno/form-inserir";
        }

        alunoRepository.save(aluno);
        redirectAttributes.addFlashAttribute("mensagem", "Jogador salvo com sucesso!");
        return "redirect:/aluno";
    }



}
