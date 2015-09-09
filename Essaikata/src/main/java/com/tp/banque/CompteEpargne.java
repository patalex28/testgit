package com.tp.banque;

import java.math.BigDecimal;

public class CompteEpargne extends AbstractCompte {
	public CompteEpargne(int numero, String libelle, BigDecimal solde){
		setNumero(numero);
		setLibelle(libelle);
		setSolde(solde);
	}
}
