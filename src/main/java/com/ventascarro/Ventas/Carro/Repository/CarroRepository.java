package com.ventascarro.Ventas.Carro.Repository;

import com.ventascarro.Ventas.Carro.Entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
