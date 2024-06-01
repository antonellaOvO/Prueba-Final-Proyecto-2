/*Autora: Antonella Alares */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicioventavehiculosdistributed;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author anto_
 */
@Entity
public class Vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;
    @Column (name = "tipo")
    private  String tipo;
    @Column (name = "marca")
    private String marca;
    @Column (name = "potencia")
    private int potencia;
    @Column (name = "fecha_compra")
    private Date fechaCompra;

    public Vehiculos() {
    }
    
    //GETTERS

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }
    
    //SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    
    
}
