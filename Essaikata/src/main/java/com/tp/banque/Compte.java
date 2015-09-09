package com.tp.banque;

import java.math.BigDecimal;

public interface Compte {
	public BigDecimal getSolde();
	public void setSolde(BigDecimal solde);
}
