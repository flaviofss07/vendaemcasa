package com.vendaemcasa.vendaemcasa.repositories;

import com.vendaemcasa.vendaemcasa.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
