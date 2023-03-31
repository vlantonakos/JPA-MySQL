package com.vlanto.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Alien a = new Alien();
    	a.setAid(10);
    	a.setAname("Nick");
    	a.setTech("Cloud Arch");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	//If i want to fetch the Alien with Id=2
        //Alien a = em.find(Alien.class,2);
    	
    	//If i want to save the Alien a in the database
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit(); 
    	
        System.out.println(a);

    }
}
