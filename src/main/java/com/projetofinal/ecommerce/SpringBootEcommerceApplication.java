package com.projetofinal.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = { "com.projetofinal.ecommerce" })
@EntityScan(basePackages =("com.projetofinal.ecommerce.domain"))
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
		System.out.println("Funcionando");
	}

}
