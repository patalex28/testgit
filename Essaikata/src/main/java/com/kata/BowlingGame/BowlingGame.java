package com.kata.BowlingGame;

public class BowlingGame {

	private int score;
	private int currentRoll;
	private int[] tabQuilles = new int[21];
	
	
	public void add(int nbQuille) {

		tabQuilles[currentRoll] = nbQuille;	
		currentRoll = currentRoll + 1;		
		
	}

	public int getCurrentScore() {
		int premierLanceDeLaFrame = 0;
		
		for (int frame = 0; frame < 10; frame++){
			if (isStrike(premierLanceDeLaFrame))
			{
				score = score + 10 + nbPtsDansFrameSuivante(premierLanceDeLaFrame);
				premierLanceDeLaFrame = premierLanceDeLaFrame + 1;
			}
			else if (isSpare(premierLanceDeLaFrame)){
				score = score + nbPtsDansFrame(premierLanceDeLaFrame) + nbPtsDans1erLanceFrameSuivante(premierLanceDeLaFrame);
				premierLanceDeLaFrame = premierLanceDeLaFrame + 2;
			}
			else{
				score = score + nbPtsDansFrame(premierLanceDeLaFrame);	
				premierLanceDeLaFrame = premierLanceDeLaFrame + 2;
			}
		}
		return score;
	}
	
	private int nbPtsDansFrameSuivante(int premierLanceDeLaFrame) {
		return tabQuilles[premierLanceDeLaFrame + 1] + tabQuilles[premierLanceDeLaFrame + 2];
	}

	private boolean isStrike(int premierLanceDeLaFrame) {
		return (tabQuilles[premierLanceDeLaFrame]) == 10;
	}

	private int nbPtsDansFrame(int premierLanceDeLaFrame){
		return tabQuilles[premierLanceDeLaFrame] + tabQuilles[premierLanceDeLaFrame + 1];
	}
	
	private int nbPtsDans1erLanceFrameSuivante(int premierLanceDeLaFrame){
		return tabQuilles[premierLanceDeLaFrame + 2] ;
	}

	private boolean isSpare(int premierLanceDeLaFrame){
		return (tabQuilles[premierLanceDeLaFrame] + tabQuilles[premierLanceDeLaFrame + 1]) == 10;
	}

	
}
