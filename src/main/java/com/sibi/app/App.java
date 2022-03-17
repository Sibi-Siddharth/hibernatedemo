package com.sibi.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.sibi.entity1.Customer;

public class App {
	
	public static void main(String[] args)
	{
		//create/obtain EntityManagerFactory object
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        
        Customer c=new Customer();
        c.setName("Nivi");
        c.setEmail("sibi7859");		
        c.setlocation("Karnataka");
	    em.persist(c);
	    tx.commit();
	    emf.close();
	}
	
	

}
