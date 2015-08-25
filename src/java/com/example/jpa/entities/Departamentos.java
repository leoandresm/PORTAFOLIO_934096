package com.example.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamentos implements Serializable{
    
    @Id
    @Column(name = "id_departamento")
    private Integer idDepartamento;
    
    @Column(name = "nombre_departamento")
    private String nombreDepartamento;
    
    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais")
    @ManyToOne(optional = false)
    private Pais idPais;
    
    //Getter
    public Integer getIdDepartamento(){
        return idDepartamento;
    }
    
    public String getNombreDepartamento(){
        return nombreDepartamento;
    }
    
    public Pais getIdPais(){
        return idPais;
    }
    
    //Setter
    public void setIdDepartamento(Integer idDepartamento){
        this.idDepartamento = idDepartamento;  
    }
    
    public void setNombreDepartamento(String nombreDepartamento){
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public void setIdPais(Pais idPais){
        this.idPais = idPais;
    }
    
    
    
    
    
}
