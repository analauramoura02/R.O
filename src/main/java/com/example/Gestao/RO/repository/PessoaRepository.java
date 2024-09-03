package com.example.Gestao.RO.repository;


import com.example.Gestao.RO.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
