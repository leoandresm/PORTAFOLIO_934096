package com.example.jpa.sessions;

import com.example.jpa.entities.Departamentos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class DepartamentoSession {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Departamentos departamento) {
        entityManager.persist(departamento);
    }

    public void edit(Departamentos departamento) {
        entityManager.merge(departamento);
    }

    public void remove(Departamentos departamento) {
        entityManager.remove(departamento);
    }

    public List<Departamentos> findAll() {
        CriteriaQuery cq
                = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Departamentos.class));
        return entityManager.createQuery(cq).getResultList();
    }
}
