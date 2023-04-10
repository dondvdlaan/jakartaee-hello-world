package org.eclipse.jakarta.hello;

import java.io.Serializable;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

@Named
@ApplicationScoped
public class Shop implements Serializable {
    
    // Attributes
    // Verknüpfung mit Persistence Unit
        EntityManagerFactory emf = 
                        Persistence.createEntityManagerFactory("testPU");
        EntityManager em = emf.createEntityManager();
    
    // Constructor
    public Shop() {
    }

    // Getters & Setters
    public List<Artikel> getSortiment() {

        // Verknüpfung mit Persistence Unit
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("testPU");
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("SELECT a FROM Artikel a");


        System.out.println("q: " + q);

        List<Artikel> sortiment = q.getResultList();

        em.close();
        emf.close();

        return sortiment;
    }
}    
