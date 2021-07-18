//package com.veterinary_clinic_adm.register.repository;
package com.repository;

//import com.veterinary_clinic_adm.register.model.Animal;
import com.model.Animal;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AnimalCustomRepository {

    private final EntityManager em;

    public AnimalCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<Animal> find(String age, String name) {

        String query = "select P from Animal as P ";
        String condicao = "where";

        if(age != null) {
            query += condicao + " P.age = :age";
            condicao = " and ";
        }

        if(name != null) {
            query += condicao + " P.name = :name";
            condicao = " and ";
        }

        var q = em.createQuery(query, Animal.class);

        if(age != null) {
            q.setParameter("age", age);
        }

        if(name != null) {
            q.setParameter("name", name);
        }
        
        return q.getResultList();
    }

}