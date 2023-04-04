package org.eclipse.jakarta.hello;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Class um Werten nach MySQL zu schreiben
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Werten nach MySQL DB schreiben");
        
        
        Artikel a = new Artikel("Naampje", "Beschrijvinkje");
        
        EntityManagerFactory entityManagerFactory   = 
        Persistence.createEntityManagerFactory("testPU");
        EntityManager entityManager                 = entityManagerFactory.createEntityManager();
        
        
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        
        
        
    }
}
