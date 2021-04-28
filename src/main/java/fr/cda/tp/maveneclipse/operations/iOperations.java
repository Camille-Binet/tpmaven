package fr.cda.tp.maveneclipse.operations;

import fr.cda.tp.maveneclipse.DAO.Client;

public interface iOperations {

	public void ajouterClient(Client c);
	
	public Client getClient(int id);
}
