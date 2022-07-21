package com.projetofinal.ecommerce.dto;

import java.util.Set;

import com.projetofinal.ecommerce.domain.Cliente;
import com.projetofinal.ecommerce.domain.Endereco;
import com.projetofinal.ecommerce.domain.Vendas;
import com.projetofinal.ecommerce.domain.VendasItem;

import lombok.Data;

@Data
public class Compra {
	
	private Cliente cliente;
	
	private Endereco endereco_entrega;
	private Endereco endereco_cobranca;
	private Vendas vendas;
	private Set<VendasItem> vendasItems;

}

