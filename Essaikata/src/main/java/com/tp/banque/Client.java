package com.tp.banque;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private final String nom;
	private final String prenom;
	private List<Compte> compte = new ArrayList<>();

	public Client(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public String getListeCompte() {
		String str = "";
		for (Compte c : compte){
			str += c.toString() + ", ";
		}
		return str;
	}
	
	void addCompte(Compte nouveauCompte){
		this.compte.add(nouveauCompte);
	}
	
}
