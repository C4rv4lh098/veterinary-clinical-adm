package com.veterinary_clinic_adm.register.repository;

import com.veterinary_clinic_adm.register.model.Tutor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TutorCustomRepository {

    private final EntityManager em;

    public TutorCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<Tutor> find(String cpf, String name) {

        String query = "select P from Pessoa as P ";
        String condicao = "where";

        if(cpf != null) {
            query += condicao + " P.cpf = :cpf";
            condicao = " and ";
        }

        if(name != null) {
            query += condicao + " P.name = :name";
            condicao = " and ";
        }

        var q = em.createQuery(query, Tutor.class);

        if(cpf != null) {
            q.setParameter("cpf", cpf);
        }

        if(name != null) {
            q.setParameter("name", name);
        }

        return q.getResultList();
    }

}