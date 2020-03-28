package com.vendaemcasa.vendaemcasa.repositories;

import com.vendaemcasa.vendaemcasa.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
