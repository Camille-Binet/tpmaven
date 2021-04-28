package fr.cda.tp.maveneclipse.controller;

import fr.cda.tp.maveneclipse.DAO.Client;
import fr.cda.tp.maveneclipse.operations.Operations;

public class Controle {

	
	Operations ops = new Operations();

	public void creerClient(String nom ,String prenom , String adresse)
	{
		Client c = new Client (nom,prenom,adresse);
		ops.ajouterClient(c);
	}
	
	public Client recupererClient(int id)
	{
		Client c = ops.getClient(id);
		return c;
	}
	
}
