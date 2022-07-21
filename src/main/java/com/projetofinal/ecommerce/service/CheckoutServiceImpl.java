package com.projetofinal.ecommerce.service;

import java.util.Set;
import java.util.UUID;

import javax.persistence.criteria.Order;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.projetofinal.ecommerce.domain.Vendas;
import com.projetofinal.ecommerce.domain.VendasItem;
import com.projetofinal.ecommerce.dto.Compra;
import com.projetofinal.ecommerce.domain.Cliente;
import com.projetofinal.ecommerce.dto.CompraResponse;
import com.projetofinal.ecommerce.repository.ClienteRepository;


@Service
public class CheckoutServiceImpl implements CheckoutService  {
	
	private ClienteRepository clienteRepository;
	
	public CheckoutServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	
	@Override
	@Transactional
	public CompraResponse placeOrder(Compra compra) {
		
		Vendas vendas = compra.getVendas();
		
		String numeroRastreioVendas = gerarVendasNumeroRastreio();
		vendas.setRastreamento_pedido(numeroRastreioVendas);
		
		Set<VendasItem> vendasItems = compra.getVendasItems();
		vendasItems.forEach(item -> vendas.add(item));
		
		vendas.setEnderecoCobranca(compra.getEndereco_cobranca());
		vendas.setEnderecoEntrega(compra.getEndereco_entrega());
		
		Cliente cliente = compra.getCliente();
		cliente.add(vendas);
		
		clienteRepository.save(cliente);
		
		
		return new CompraResponse (numeroRastreioVendas);
	}


	private String gerarVendasNumeroRastreio() {
		
		return UUID.randomUUID().toString();
	}
	
	

}
