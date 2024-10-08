package com.example.Gestao.RO.controller;

import com.example.Gestao.RO.model.Professor;
import com.example.Gestao.RO.repository.ProfRepository;
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
@RequestMapping("/professor")
public class ProfController {

    @Autowired
    private ProfRepository profRepository;


    // Carrega o form-inserir.html
    @GetMapping("/form-inserir")
    public String formInserir(Model model){

        model.addAttribute("prof", new Professor());
        return "professor/form-inserir";

    }

    // Método para salvar o jogador
    @PostMapping("/salvar")
    public String salvar(
            @Valid Professor professor,
            BindingResult result,
            RedirectAttributes redirectAttributes){

        // Verifica se há erros de validação
        if(result.hasErrors()){
            return "professor/form-inserir";
        }

        profRepository.save(professor);
        redirectAttributes.addFlashAttribute("mensagem", "Jogador salvo com sucesso!");
        return "redirect:/professor";
    }
}
