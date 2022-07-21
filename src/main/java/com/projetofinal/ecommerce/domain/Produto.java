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
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import lombok.Data;

@Entity
@Table(name="produto")
@Data

public class Produto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private ProdutoCategoria categoria;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco_unidade")
    private BigDecimal preco_unidade;

    @Column(name = "imagem", nullable = false)
    private String imagem;

    @Column(name = "ativo")
    private boolean ativo;

    @Column(name = "unidades_em_estoque")
    private int unidades_em_estoque;

    @Column(name = "data_criacao")
    @CreationTimestamp
    private Date data_criacao;

    @Column(name = "ultima_atualizacao")
    @UpdateTimestamp
    private Date ultima_atualizacao;
    
    
    
   
}
