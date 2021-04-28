package fr.cda.tp.maveneclipse.operations;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.cda.tp.maveneclipse.DAO.Client;
public class Operations implements iOperations{
 
	EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;
	
	
	public Operations() {
		 
	}

	public void ajouterClient(Client c) {

		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("premiertpjpa");
			entityManager = entityManagerFactory.createEntityManager();
			
			EntityTransaction trans = entityManager.getTransaction();
			trans.begin();
			entityManager.persist(c);
			trans.commit();
		}
		finally {
			if(entityManager!=null)entityManager.close();
			if(entityManagerFactory!=null)entityManagerFactory.close();
		}
		
		
	}
	
	public Client getClient(int id) {

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("premiertpjpa");
			entityManager = entityManagerFactory.createEntityManager();
						
			Client c = entityManager.find(Client.class, id);
			return c;
			
		}
		finally {
			if(entityManager!=null)entityManager.close();
			if(entityManagerFactory!=null)entityManagerFactory.close();
		}
		
	}
	
}