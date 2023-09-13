package com.CadastroAPI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CadastroAPI.repository.CadastroRepository;
import com.CadastroAPI.models.Cadastro;

@RestController
@RequestMapping(value="/api")
public class CadastroResource {
	
	@Autowired
	CadastroRepository cadastroRepository;
	
	@GetMapping("/todos")
	//Retorna uma lista de pessoas do banco
	public List<Cadastro> listaCadastros(){
		return cadastroRepository.findAll();
	}
	
	@GetMapping("/pessoa/{id}")
	//Retorna uma unica pessoa do banco
	public Cadastro listaCadastro(@PathVariable(value="id") long id){
		return cadastroRepository.findById(id);
	}
	
	@PostMapping("/salvar")
	//Salva uma pessoa
	public Cadastro salvarCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
		
	}
	
	@DeleteMapping("/apagar")
	//Apaga uma pessoa
	public void apagaCadastro(@RequestBody Cadastro cadastro) {
		cadastroRepository.delete(cadastro);
		
	}
	
	@PutMapping("/atualizar")
	//Atualiza uma pessoa
	public Cadastro atualizarCadastro(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
		
	}
	

}
