package com.vendaemcasa.vendaemcasa.repositories;

import com.vendaemcasa.vendaemcasa.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
