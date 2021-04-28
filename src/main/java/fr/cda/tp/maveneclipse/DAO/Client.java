package fr.cda.tp.maveneclipse.DAO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table( name="client" )
 
public class Client {
	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	
	@Column( name="id" )
	private int id;
	@Column( name="nom" )
	private String nom;
	@Column( name="prenom" )
	private String prenom;
	@Column( name="adresse" )
	private String adresse;
	
	
	public Client(){
		
	}
	
	public Client(String nom, String prenom, String adresse){
		
		 
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	
}
