package com.vendaemcasa.vendaemcasa.repositories;

import com.vendaemcasa.vendaemcasa.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
