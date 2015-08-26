/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author leoandresm
 */
@Entity
@Table(name = "CIUDADES")
@IdClass(value = CiudadPK.class) //Clase clave primaria varios campos
public class Ciudad implements Serializable{
    
    @Id
    @Column(name = "id_ciudad")
    private int idCiudad;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamentos idDepartamento;
    
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, Departamentos idDepartamento) {
        this.idCiudad = idCiudad;
        this.idDepartamento = idDepartamento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Departamentos getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamentos idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }    
    
}
