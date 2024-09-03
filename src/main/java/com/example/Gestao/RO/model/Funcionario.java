package com.example.Gestao.RO.model;


import com.example.Gestao.RO.enums.Funcao;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue(value = "F")
public class Funcionario extends Pessoa{

    private Funcao funcao;
    private Double salario;
}
