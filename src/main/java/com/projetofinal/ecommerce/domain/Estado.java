package com.projetofinal.ecommerce.domain;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="estado")
@Data
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="pais_id")
	private Pais pais;
	
	
	

   

}
