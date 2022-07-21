package com.projetofinal.ecommerce.repository;
import com.projetofinal.ecommerce.domain.Estado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	// http://localhost:8080/api/estadoes/search/findByPaisCode?code=IN
	List<Estado> findByPaisCode(@Param("code") String cod);
	
	
	
	
	

}
