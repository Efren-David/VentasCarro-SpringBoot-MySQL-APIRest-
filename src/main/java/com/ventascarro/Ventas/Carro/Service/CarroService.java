package com.ventascarro.Ventas.Carro.Service;


import com.ventascarro.Ventas.Carro.Entity.Carro;
import com.ventascarro.Ventas.Carro.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> getAllCar(){
        return carroRepository.findAll();
    }

    public Carro createCar(Carro carro){
        return carroRepository.save(carro);
    }

    public Carro updateCarro(Carro carro){
        return carroRepository.save(carro);
    }

    public void deleteCar(Long id){
        carroRepository.deleteById(id);
    }
}
