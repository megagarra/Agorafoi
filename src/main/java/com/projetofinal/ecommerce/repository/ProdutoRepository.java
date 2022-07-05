package com.projetofinal.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.projetofinal.ecommerce.domain.Produto;

@CrossOrigin("http://localhost:4200")
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
