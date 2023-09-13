package com.CadastroAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CadastroAPI.models.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
	
	Cadastro findById(long id);

}
