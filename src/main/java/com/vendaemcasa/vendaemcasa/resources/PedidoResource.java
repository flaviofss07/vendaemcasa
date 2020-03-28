package com.vendaemcasa.vendaemcasa.resources;

import com.vendaemcasa.vendaemcasa.domain.Pedido;
import com.vendaemcasa.vendaemcasa.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService service;

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Pedido obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}
