package org.eclipse.jakarta.hello;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

/**
 * Class um Werten nach MySQL zu schreiben
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Werten nach MySQL DB schreiben");
        
        
        Artikel a = new Artikel("Naampje", "Beschrijvinkje");
        Artikel b = new Artikel("Naampje2", "Beschrijvinkje2");

        EntityManagerFactory entityManagerFactory   = 
        Persistence.createEntityManagerFactory("testPU");
        EntityManager entityManager                 = entityManagerFactory.createEntityManager();
        
        
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.persist(b);
        entityManager.getTransaction().commit();


        Query q = entityManager.createQuery("SELECT a FROM Artikel a");

        System.out.println("q: " + q);


        List<Artikel> sortiment = q.getResultList();

        for(Artikel art : sortiment ){
            System.out.println("art: " + art);
        }

        entityManager.close();
        entityManagerFactory.close();

    }
}
