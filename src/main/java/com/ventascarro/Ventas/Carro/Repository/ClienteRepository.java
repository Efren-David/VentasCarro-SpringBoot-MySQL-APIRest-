package com.ventascarro.Ventas.Carro.Repository;

import com.ventascarro.Ventas.Carro.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
