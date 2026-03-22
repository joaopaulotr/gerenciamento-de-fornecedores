package com._exercicios.demo.repositories;


import com._exercicios.demo.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository <FornecedorModel, Long> {
}
