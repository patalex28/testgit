package com.kata.tennisGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

	public static final List<String> pointsDescription = new ArrayList<>(Arrays.asList("love", "fifteen", "thirty", "forty"));
	private final String name;
	private int score;
	
	public Player(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void winBall() {
		this.score = this.score + 1;
		
	}
	
	 public String getScoreDescription(){
	        return pointsDescription.get(score);
	 }

	public String getName() {
		return name;
	}
	
	

}
