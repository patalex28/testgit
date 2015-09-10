package com.tp.banque.compte;

import java.math.BigDecimal;

import com.tp.banque.Compte;
import com.tp.banque.VirementException;

public class OperationCompte {
	public void virement(Compte source, Compte destination, BigDecimal montant){
		if (montant.compareTo(source.getSolde()) == 1) throw new VirementException("Impossible d'effectuer le virement, pas assez d'argent sur le compte source");
		destination.setSolde(destination.getSolde().add(montant));
		source.setSolde(source.getSolde().subtract(montant));
	}
}
