package com.projetofinal.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetofinal.ecommerce.dto.Compra;
import com.projetofinal.ecommerce.dto.CompraResponse;
import com.projetofinal.ecommerce.service.CheckoutService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
	
	private CheckoutService checkoutService;
	
	
	public CheckoutController(CheckoutService checkoutService) {
		this.checkoutService = checkoutService;
	}

	@PostMapping("/compra")
	public CompraResponse placeOrder(@RequestBody Compra compra) {
		
		CompraResponse compraResponse = checkoutService.placeOrder(compra);
		
		return compraResponse;
		
	}
}
