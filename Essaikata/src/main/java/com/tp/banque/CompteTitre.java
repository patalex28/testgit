package com.tp.banque;

import java.math.BigDecimal;

public class CompteTitre extends AbstractCompte {

	public CompteTitre(int numero, String libelle, BigDecimal solde){
		setNumero(numero);
		setLibelle(libelle);
		setSolde(solde.divide(new BigDecimal(10)));
	}

}
