package com.sibi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sibi.entity1.Album;
import com.sibi.user.Order;
import com.sibi.user.Product;
import com.sibi.user.User;



public class GenericDao {
	public void oper(Object obj) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        //merge can be used for insert as well as update
        em.merge(obj);//adding a entity
	    tx.commit();
	    emf.close();
	}
	public Object fetchById(Class clas,Object pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatedemo");
		EntityManager em = emf.createEntityManager();
		Object obj = em.find(clas, pk);// fetch using primary key
		emf.close();
		return obj;

	}
	public List<Order> fetchorder(){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select o from Order o ");
    	List<Order> list =q.getResultList();
    	emf.close();
    	return list;
    }
	public List<Product> fetchprod(){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select p from Product p ");
    	List<Product> list =q.getResultList();
    	emf.close();
    	return list;
    }
	public List<User> fetchuser(){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select u from User u ");
    	List<User> list =q.getResultList();
    	emf.close();
    	return list;
    }
	public List<User> fetchUsername(String name){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select u from User u where name= :nm");
    	q.setParameter("nm", name);
    	List<User> list =q.getResultList();
    	emf.close();
    	return list;
    }
	public List<Product> fetchprice(double range1,double range2){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select p from Product p where price between :r1 AND :r2 ");
    	q.setParameter("r1", range1);
    	q.setParameter("r2", range2);
    	List<Product> list =q.getResultList();
    	emf.close();
    	return list;
    }
    

}
