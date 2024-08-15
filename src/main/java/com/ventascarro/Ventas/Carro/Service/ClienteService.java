package com.ventascarro.Ventas.Carro.Service;


import com.ventascarro.Ventas.Carro.Entity.Cliente;
import com.ventascarro.Ventas.Carro.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //mostrar
    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    //crear
    public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //editar
    public Cliente updateCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    //eliminar

    public void deleteCliente(Long id){
        clienteRepository.deleteById(id);
    }


}
