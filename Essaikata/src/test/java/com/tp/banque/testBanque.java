package com.tp.banque;

import com.tp.banque.compte.OperationCompte;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import org.junit.Test;

public class testBanque {

	@Test
	public void Creation_d_un_client_et_test_du_nom_et_du_prenom() {
		Client c = new Client("Candelon", "Alexandre");
		assertEquals("Candelon", c.getNom());
		assertEquals("Alexandre", c.getPrenom());
	}
	
	@Test
	public void Affichage_de_la_liste_des_compte_d_un_client() {
		Compte monCompteCourant = new CompteCourant(12345, "Compte Courant Alex", new BigDecimal("12.85"));
		Compte monCompteEpargne = new CompteEpargne(54564, "Compte Epargne Alex", new BigDecimal("1200.85"));
		Client c = new Client("Candelon", "Alexandre");
		c.addCompte(monCompteCourant);
		assertEquals("12345 : Compte Courant Alex, ", c.getListeCompte());
		c.addCompte(monCompteEpargne);
		assertEquals("12345 : Compte Courant Alex, 54564 : Compte Epargne Alex, ", c.getListeCompte());
	}
	
	@Test
	public void Affichage_du_solde_d_un_compte() {
		Compte monCompteCourant = new CompteCourant(12345, "Compte Courant Alex", new BigDecimal("12.85"));
		Compte monCompteEpargne = new CompteEpargne(54564, "Compte Epargne Alex", new BigDecimal("1200.85"));
		Compte monCompteTitre = new CompteTitre(5414, "Compte Titre Alex", new BigDecimal("151200.85"));
		assertEquals("12.85", monCompteCourant.getSolde().toString());
		assertEquals("1200.85", monCompteEpargne.getSolde().toString());
		assertEquals("15120.085", monCompteTitre.getSolde().toString());
	}
	
	@Test
	public void Virement_compteCourant_vers_compteEpargne() {
		Compte monCompteCourant = new CompteCourant(12345, "Compte Courant Alex", new BigDecimal("120.10"));
		Compte monCompteEpargne = new CompteEpargne(54564, "Compte Epargne Alex", new BigDecimal("80.20"));
		OperationCompte ope = new OperationCompte();
		ope.virement(monCompteCourant, monCompteEpargne, new BigDecimal("10"));
		assertEquals("90.20", monCompteEpargne.getSolde().toString());
		assertEquals("110.10", monCompteCourant.getSolde().toString());
	}
	
	@Test
	public void Si_solde_compteCourant_Inferieur_au_montant_du_virement_alors_impossible_de_faire_le_virement() {
		Compte monCompteCourant = new CompteCourant(12345, "Compte Courant Alex", new BigDecimal("120.10"));
		Compte monCompteEpargne = new CompteEpargne(54564, "Compte Epargne Alex", new BigDecimal("80.20"));
		OperationCompte ope = new OperationCompte();
		ope.virement(monCompteCourant, monCompteEpargne, new BigDecimal("130"));
		assertEquals("120.10", monCompteCourant.getSolde().toString());
		assertEquals("80.20", monCompteEpargne.getSolde().toString());
	}
	
	



}
