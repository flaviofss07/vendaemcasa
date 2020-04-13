package com.vendaemcasa.vendaemcasa.services;


import com.vendaemcasa.vendaemcasa.domain.Cliente;
import com.vendaemcasa.vendaemcasa.repositories.ClienteRepository;
import com.vendaemcasa.vendaemcasa.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }


}
