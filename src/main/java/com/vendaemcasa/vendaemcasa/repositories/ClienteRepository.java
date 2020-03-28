package com.vendaemcasa.vendaemcasa.repositories;

import com.vendaemcasa.vendaemcasa.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
