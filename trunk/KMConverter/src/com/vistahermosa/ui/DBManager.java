package com.vistahermosa.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author thomas
 */
public class DBManager {
    EntityManagerFactory emf;
    EntityManager em;
    Contacts c;
    
    //used for inserts
    public DBManager() {
        emf = Persistence.createEntityManagerFactory("KMConverterPU");
        em = emf.createEntityManager();
    }
    
    //used for update or delete
    public DBManager(Contacts c) {
        emf = Persistence.createEntityManagerFactory("KMConverterPU");
        em = emf.createEntityManager();
        
        this.c = c;
    }
    
    //clean up all instances of this class
    public void close() {
        em.close();
        emf.close();
    }
    
    //insert this record
    public void insert(Contacts c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    
    //find a record by it's id
    public Contacts findById(int id) {
        Contacts c = em.find(Contacts.class, id);
        return c;
    }
    
    //delete this record
    public void delete(Contacts c) {
        em.getTransaction().begin();
        //this is a little weird as we have to find the object once again
        //before its deleted - required because the object has to be in
        //the same context - too complicated to explain fully here
        Contacts contact = findById(c.getId());
        em.remove(contact);
        em.getTransaction().commit();
    }
    
    //update this record
    public void update (Contacts c) {
        Contacts contacts = em.find(Contacts.class, c.getId());
        em.getTransaction().begin();
        contacts.setFirstname(c.getFirstname());
        contacts.setLastname(c.getLastname());
        contacts.setStreet(c.getStreet());
        contacts.setDatebirth(c.getDatebirth());
        em.getTransaction().commit();
    }
}