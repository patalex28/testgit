package com.tp.banque;

import java.math.BigDecimal;

public class CompteCourant extends AbstractCompte {
	public CompteCourant(int numero, String libelle, BigDecimal solde){
		setNumero(numero);
		setLibelle(libelle);
		setSolde(solde);
	}
}
