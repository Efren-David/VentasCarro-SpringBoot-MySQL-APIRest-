package com.ventascarro.Ventas.Carro.Controller;


import com.ventascarro.Ventas.Carro.Entity.Cliente;
import com.ventascarro.Ventas.Carro.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cliente")
public class ClienteControler {

    @Autowired
    ClienteService clienteService;

    //get
    @GetMapping
    public List<Cliente> listarTodo(){
        return clienteService.getAllCliente();
    }

    //post
    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    //put
    @PutMapping("editar/{id}")
    public Cliente actualizar(@RequestBody Cliente cliente, @PathVariable Long id){
        cliente.setId(id);
        return clienteService.updateCliente(cliente);
    }

    //delete
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }
}
