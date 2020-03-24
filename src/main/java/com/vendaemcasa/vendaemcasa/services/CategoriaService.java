package com.vendaemcasa.vendaemcasa.services;

import com.vendaemcasa.vendaemcasa.domain.Categoria;
import com.vendaemcasa.vendaemcasa.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }


}
