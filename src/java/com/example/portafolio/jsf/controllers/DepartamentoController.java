package com.example.portafolio.jsf.controllers;

import com.example.portafolio.jpa.entities.Departamento;
import com.example.portafolio.jpa.sessions.DepartamentoSession;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DepartamentoController {

    @EJB
    private DepartamentoSession departamentoSession;

    private Departamento selectedDepartamento;
    private List<Departamento> itemsDepartamentos = null;
    
    public Departamento getSelectedDepartamento() {
        if (selectedDepartamento == null) {
            selectedDepartamento = new Departamento();
        }
        return selectedDepartamento;
    }

    public void setSelectedDepartamento(Departamento selectedDepartamento) {
        this.selectedDepartamento = selectedDepartamento;
    }

    public DepartamentoSession getDepartamentoSession() {
        return departamentoSession;
    }

    public List<Departamento> getItemsDepartamentos() {
        if (itemsDepartamentos == null) {
            try {
                itemsDepartamentos = getDepartamentoSession().findAll();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        return itemsDepartamentos;
    }

    public void create() {
        try {
            getDepartamentoSession().create(selectedDepartamento);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

}
