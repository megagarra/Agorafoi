package com.projetofinal.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projetofinal.ecommerce.domain.ProdutoCategoria;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "produtoCategoria", path = "produto-categoria")
public interface ProdutoCategoriaRepository extends JpaRepository<ProdutoCategoria, Long> {

}
