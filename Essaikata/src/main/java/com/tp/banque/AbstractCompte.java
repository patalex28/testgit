package com.tp.banque;

import java.math.BigDecimal;

public abstract class AbstractCompte implements Compte {

	private int numero;
	private String libelle;
	private BigDecimal solde;
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public BigDecimal getSolde() {
		return solde;
	}
	public void setSolde(BigDecimal solde) {
		this.solde = solde;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString()
	{
		return numero + " : " + libelle;
	}
}
