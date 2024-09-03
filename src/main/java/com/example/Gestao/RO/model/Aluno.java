package com.example.Gestao.RO.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
// A de Aluno
@DiscriminatorValue(value = "A")
public class Aluno extends Pessoa{


    @NotNull(message = "A matrícula deve ser informada")
    private Long matricula;


    @ManyToMany
    private List<Turma> turmas;


    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }


    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }


}