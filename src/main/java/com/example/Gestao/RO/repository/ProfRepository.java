package com.example.Gestao.RO.repository;

import com.example.Gestao.RO.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepository extends JpaRepository <Professor, Long> {
}
