package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Aluno;
import com.example.Gestao.RO.model.Turma;
import com.example.Gestao.RO.repository.TurmaRepository;
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
@RequestMapping("/turma")
public class TurmaController {
    @Autowired
    private TurmaRepository turmaRepository;

    @GetMapping
    public String listagem(Model model){
        model.addAttribute("turmas", turmaRepository.findAll());
        return "turma/listagem";
    }

    @GetMapping("/form-inserir")
    public String formInserir(Model model){
        model.addAttribute("turma", new Turma());
        return  "turma/form-inserir";
    }

    @PostMapping("/salvar")
    public String salvar(
            @Valid Turma turma,
            BindingResult result,
            RedirectAttributes redirectAttributes){

        // Verifica se há erros de validação
        if(result.hasErrors()){
            return "turma/form-inserir";
        }

        turmaRepository.save(turma);
        redirectAttributes.addFlashAttribute("mensagem", "Jogador salvo com sucesso!");
        return "redirect:/turma";
    }
}
