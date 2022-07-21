package com.projetofinal.ecommerce.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="vendas_item")
@Getter
@Setter

public class VendasItem implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="imagem")
	private String imagem;
	
	@Column(name="quantidade")
	private int quantidade;
	
	@Column(name="preco_unidade")
	private BigDecimal preco_unidade;
	
	@Column(name="produto_id")
	private Long produto_id;

	@ManyToOne
	@JoinColumn(name = "vendas_id")
	private Vendas vendas;

}
