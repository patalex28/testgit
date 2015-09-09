package com.tp.banque.compte;

import java.math.BigDecimal;

import com.tp.banque.Compte;

public class OperationCompte {
	public void virement(Compte source, Compte destination, BigDecimal montant){
		System.out.println(montant.compareTo(source.getSolde()));
		if (montant.compareTo(source.getSolde()) != 1){
			destination.setSolde(destination.getSolde().add(montant));
			source.setSolde(source.getSolde().subtract(montant));
			
		}
		else{
			
		}
	}
}
