package com.example.jsf.controllers;

import com.example.jpa.entities.Departamentos;
import com.example.jpa.sessions.DepartamentoSession;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DepartamentoController {

    @EJB
    private DepartamentoSession departamentoSession;

    private Departamentos selectedDepartamento;
    private List<Departamentos> itemsDepartamentos = null;
    
    public Departamentos getSelectedDepartamento() {
        if (selectedDepartamento == null) {
            selectedDepartamento = new Departamentos();
        }
        return selectedDepartamento;
    }

    public void setSelectedDepartamento(Departamentos selectedDepartamento) {
        this.selectedDepartamento = selectedDepartamento;
    }

    public DepartamentoSession getDepartamentoSession() {
        return departamentoSession;
    }

    public List<Departamentos> getItemsDepartamentos() {
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
