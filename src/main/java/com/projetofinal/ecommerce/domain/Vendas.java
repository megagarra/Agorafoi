package com.projetofinal.ecommerce.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="vendas")
@Getter
@Setter
public class Vendas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="rastreamento_pedido")
	private String rastreamento_pedido;
	
	@Column(name="quantidade_total")
	private int quantidade_total;
	
	@Column(name="status")	
	private String status;
	
	@Column(name="data_criacao")
	@CreationTimestamp
	private Date data_criacao;
	
	
	@Column(name="ultima_atualizacao")
	@UpdateTimestamp
	private Date ultima_atualizacao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vendas")
	private Set<VendasItem> vendasitems = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name = "clientes_id")
	private Cliente clientes;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_entrega_id", referencedColumnName = "id")
	private Endereco enderecoEntrega;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_cobranca_id", referencedColumnName = "id")
	private Endereco enderecoCobranca;
	
	
	
	public void add(VendasItem item) {
		
		if(item != null) {
			if (vendasitems == null) {
				vendasitems = new HashSet<>();
			}
			
			vendasitems.add(item);
			item.setVendas(this);
		}
		
	}
	
	
	
	

}
