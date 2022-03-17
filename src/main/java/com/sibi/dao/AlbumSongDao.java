package com.sibi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sibi.entity1.Album;
import com.sibi.entity1.Song;


public class AlbumSongDao {
	public List<Album> fetchAllAlbum(){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select a from Album a");
    	List<Album> list = q.getResultList();//getting entire table
    	emf.close();
    	return list;
    }
	public List<Song> fetchAllSong(){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select s from Song s");
    	List<Song> list = q.getResultList();//getting entire table
    	emf.close();
    	return list;
    }
    public List<Album> fetchAlbumYear(int year){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select a from Album a where year(releaseDate) = :yr");
    	q.setParameter("yr", year);
    	List<Album> list =q.getResultList();
    	emf.close();
    	return list;
    }
    public List<Song> fetchSongArtist(String Artist){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select s from Song s where Artist = :ar");
    	q.setParameter("ar", Artist);
    	List<Song> list =q.getResultList();
    	emf.close();
    	return list;
    }
    public List<Song> fetchSongYear(int year){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select s from Song s join s.album a where year(a.releaseDate) = :yr");
    	q.setParameter("yr", year);
    	List<Song> list =q.getResultList();
    	emf.close();
    	return list;
    }
    public List<Album> fetchAlbumArtist(String Artist){
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernatedemo");
        EntityManager em=emf.createEntityManager();
        //JavaPersistenceQueryLang/HibernateQueryLang 
    	Query q=em.createQuery("select a from Album a join a.songs s where s.Artist = :ar");
    	q.setParameter("ar", Artist);
    	List<Album> list =q.getResultList();
    	emf.close();
    	return list;
    }
}
