package com.example.Gestao.RO.repository;

import com.example.Gestao.RO.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}

