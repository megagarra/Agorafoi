package com.projetofinal.ecommerce.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="endereco")
@Getter
@Setter

public class Endereco {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="estado")
	private String estado;

	@Column(name="rua")
	private String rua;
	
	@Column(name="cep")
	private String cep;
	
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Vendas vendas;

}
