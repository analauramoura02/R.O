package com.example.Gestao.RO.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String curso;

    private String docente;
    private String periodo;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dataConclusao;

}
