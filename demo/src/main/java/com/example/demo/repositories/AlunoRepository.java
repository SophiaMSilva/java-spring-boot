package com.example.demo.repositories;

import com.example.demo.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel,Long> {
}
