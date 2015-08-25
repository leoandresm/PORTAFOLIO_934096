/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author leoandresm
 */
@Entity
@Table(name = "PAISES")
public class Pais implements Serializable {
    @Id
    @Column(name = "id_pais")
    private String idPais;
    
    @Column(name = "nombre_pais")
    private String nombrePais;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPais")
    private List<Departamentos> listDepartamentos;

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    public List<Departamentos> getListDepartamentos(){
        return listDepartamentos;
    }
    
    public void setListDepartamentos(List<Departamentos> listDepartamentos){
        this.listDepartamentos = listDepartamentos;
    }
    
    
}
