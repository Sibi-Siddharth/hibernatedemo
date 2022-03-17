package com.sibi.dao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sibi.entity1.Customer;



public class CustomerDao {
	
	public void add(Customer customer) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        em.persist(customer);//adding a entity
	    tx.commit();
	    emf.close();
	}
    public Customer fetch(int id) {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        Customer c=em.find(Customer.class, id);//fetch using primary key
        emf.close();
        return c;
    	
    }
    public List<Customer> fetchAll(){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select c from Customer c");
    	List<Customer> list = q.getResultList();//getting entire table
    	emf.close();
    	return list;
    }
    public List<Customer> fetchbycond(String location){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select c from Customer c where c.location = :loc");//fetching a specific entity
    	q.setParameter("loc", location);
    	List<Customer> list = q.getResultList();
    	emf.close();
    	return list;
    }
    public void updateData(Customer customer) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        em.merge(customer);//generate update query
	    tx.commit();
	    emf.close();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
