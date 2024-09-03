package com.example.Gestao.RO.repository;

import com.example.Gestao.RO.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    List<Aluno> findByNomeContainingIgnoreCase(String nome);

    Aluno findByEmail(String email);

    Aluno findByCpf(String cpf);


    // Pesquisa o email e o id seja diferente
    // do id que está sendo alterado
    Aluno findByEmailAndIdNot(String email, Long id);

    // Pesquisa o cpf e o id seja diferente
    // do id que está sendo alterado
    Aluno findByCpfAndIdNot(String cpf, Long id);



}
