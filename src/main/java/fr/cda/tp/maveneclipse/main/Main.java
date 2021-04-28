package fr.cda.tp.maveneclipse.main;

import java.awt.EventQueue;

import fr.cda.tp.maveneclipse.vue.GestionClient;
 

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {	
					 new GestionClient();
			}
		});
		

	}

}
