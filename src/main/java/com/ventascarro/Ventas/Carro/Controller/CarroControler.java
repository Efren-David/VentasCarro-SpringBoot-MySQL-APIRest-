package com.ventascarro.Ventas.Carro.Controller;


import com.ventascarro.Ventas.Carro.Entity.Carro;

import com.ventascarro.Ventas.Carro.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/carros")
public class CarroControler {

    @Autowired
    CarroService carroService;

    @Autowired
    Carro carro;

    // GET: Obtener todos los carros
    @GetMapping
    public ResponseEntity<List<Carro>> listarTodo(){
        List<Carro> carros = carroService.getAllCar();
        return ResponseEntity.ok(carros);
    }

    // POST: Crear un nuevo carro
    @PostMapping("/crear")
    public ResponseEntity<String> createCar(@RequestBody Carro carro) {
        Carro nuevoCarro = carroService.createCar(carro);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Carro creado exitosamente con ID: " + nuevoCarro.getId());

    }

    // PUT: Actualizar un carro existente
    @PutMapping("editar/{id}")
    public ResponseEntity<String> updateCarro(@RequestBody Carro carro, @PathVariable Long id) {
        carro.setId(id);
        Carro updateCarro = carroService.updateCarro(carro);
        return ResponseEntity.ok("Carro con ID " + updateCarro.getId() + " actualizado exitosamente");
    }

    // DELETE: Eliminar un carro por ID
    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id) {
        carroService.deleteCar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body("Carro con ID " + id + " eliminado exitosamente");
    }

}
