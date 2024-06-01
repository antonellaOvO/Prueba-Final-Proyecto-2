/*Autora: Antonella Alares */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicioventavehiculosdistributed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author anto_
 */

@RestController
@RequestMapping("/vehiculos")
public class VehiculosController {
    
    @Autowired
    private VehiculosRepository vehiculoRepository;

    @GetMapping
    public List<Vehiculos> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehiculos> getVehiculoById(@PathVariable Integer id) {
        Optional<Vehiculos> vehiculo = vehiculoRepository.findById(id);
        if (vehiculo.isPresent()) {
            return ResponseEntity.ok(vehiculo.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Vehiculos createVehiculo(@RequestBody Vehiculos vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @PutMapping("actualizar-potencia/{id}")
    public ResponseEntity<Vehiculos> updatePotenciaVehiculo(@PathVariable Integer id, @RequestBody Vehiculos vehiculoDetails) {
        Optional<Vehiculos> vehiculo = vehiculoRepository.findById(id);
        if (vehiculo.isPresent()) {
            Vehiculos vehiculoToUpdate = vehiculo.get();
            vehiculoToUpdate.setPotencia(vehiculoDetails.getPotencia());
            return ResponseEntity.ok(vehiculoRepository.save(vehiculoToUpdate));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehiculo(@PathVariable Integer id) {
        Optional<Vehiculos> vehiculo = vehiculoRepository.findById(id);
        if (vehiculo.isPresent()) {
            vehiculoRepository.delete(vehiculo.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/calcular-potencia-media")
    public Double getAveragePotenciaByTipo(@RequestParam String tipo) {
        return vehiculoRepository.findAveragePotenciaByTipo(tipo);
    }
    
     @GetMapping("/calcular-potencia-maxima")
    public Double getPotenciaMaximaByTipo(@RequestParam String tipo) {
        return vehiculoRepository.findPotenciaMaximaByTipo(tipo);
    }
    
    
}
