package com.projetofinal.ecommerce.repository;


import com.projetofinal.ecommerce.domain.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "pais", path = "pais")
public interface PaisRepository extends JpaRepository<Pais, Integer> {

}

