package com.kata.tennisGame;

public class Game {
	
	private final Player player1;
	private final Player player2;

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public String getScore(){
		if (player1.getScore() >= 3 && player2.getScore() >= 3) {
			if (Math.abs(player1.getScore() - player2.getScore()) >=2){
				return getLeadPlayer().getName() + " won";
			}			
			if (player1.getScore() == player2.getScore()){
				return "deuce";
			}
			return "advantage " + getLeadPlayer().getName();
		}
		return player1.getScoreDescription() + ", " + player2.getScoreDescription();
	}
	
	public Player getLeadPlayer(){
		if (player1.getScore() > player2.getScore()) return player1;
		else return player2;
	}

}
