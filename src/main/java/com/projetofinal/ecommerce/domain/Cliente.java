package com.projetofinal.ecommerce.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="clientes")
@Getter
@Setter
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="email")
	private String email;
	
	@OneToMany(mappedBy = "clientes", cascade = CascadeType.ALL)
	
	
	private Set<Vendas> vendas = new HashSet<>();
	
	public void add(Vendas venda) {
		
		if(vendas != null) {
			
			if (vendas == null) {
				vendas = new HashSet<>();
			}
			
			vendas.add(venda);
			venda.setClientes(this);
		}
	}

}
