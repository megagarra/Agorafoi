package com.projetofinal.ecommerce.repository;


import com.projetofinal.ecommerce.domain.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin("http://localhost:4200")
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Page<Produto> findByCategoriaId(@RequestParam("id") Long id, Pageable pageable);
	
	///
	
	Page<Produto> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}
