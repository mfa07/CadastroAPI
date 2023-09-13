package com.CadastroAPI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter @EqualsAndHashCode
@Entity
@Table(name="tb_cadastroPessoa")
public class Cadastro {
	
	@SuppressWarnings("unused")
	private static final long seralVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private Integer idade;

}
