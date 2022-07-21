package com.projetofinal.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetofinal.ecommerce.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
