package com.example.mavenproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
	public static void main(String [] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mypersistenceUnit");
		EntityManager em=emf.createEntityManager();
		dbconnection db=new dbconnection("anish",92);
		em.getTransaction().begin();
		em.persist(db);
		em.getTransaction().commit();
		System.out.println("data is pushed");
		
		}

}