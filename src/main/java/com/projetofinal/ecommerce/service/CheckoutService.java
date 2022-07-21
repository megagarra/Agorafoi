package com.projetofinal.ecommerce.service;

import com.projetofinal.ecommerce.dto.CompraResponse;
import com.projetofinal.ecommerce.dto.Compra;

public interface CheckoutService {
	
	 CompraResponse placeOrder(Compra compra);
		
	

}
