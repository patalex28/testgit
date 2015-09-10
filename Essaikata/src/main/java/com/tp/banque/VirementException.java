package com.tp.banque;

public class VirementException extends RuntimeException {
	public VirementException(){
		super();
		System.out.println("Impossible d'effectuer le virement, pas assez d'argent sur le compte");
	}
	
	public VirementException(String s){
		super(s);
	}
	
}
