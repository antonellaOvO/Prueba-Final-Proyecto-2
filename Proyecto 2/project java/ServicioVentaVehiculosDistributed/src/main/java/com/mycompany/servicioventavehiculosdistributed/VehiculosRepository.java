/*Autora: Antonella Alares */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.servicioventavehiculosdistributed;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anto_
 */
public interface VehiculosRepository extends JpaRepository<Vehiculos, Integer> {
    @Query(value = "SELECT AVG(v.potencia) FROM Vehiculos v WHERE v.tipo = :tipo", nativeQuery = true)
    Double findAveragePotenciaByTipo(@Param("tipo") String tipo);
    
    @Query(value = "SELECT MAX(potencia) AS potencia_maxima FROM Vehiculos WHERE tipo = :tipo", nativeQuery = true)
    Double findPotenciaMaximaByTipo(@Param("tipo") String tipo);
    
}
