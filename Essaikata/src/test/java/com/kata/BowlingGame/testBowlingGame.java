package com.kata.BowlingGame;

import static org.junit.Assert.*;

import javax.management.relation.RoleList;

import org.junit.Before;
import org.junit.Test;

public class testBowlingGame {

	private BowlingGame bg;

    @Before
    public void setUp() throws Exception {
        bg = new BowlingGame();
    }
    
    @Test
    public void canRollGutterBall() {
        bg.add(0);
        assertEquals(0, bg.getCurrentScore());
    }
    

    @Test
    public void canHitPins() {
        bg.add(1);
        bg.add(3);

        assertEquals(4, bg.getCurrentScore());
    }
    
    @Test
    public void canRollSpare() {
        rollSpare();
        bg.add(2);
        assertEquals(14, bg.getCurrentScore());
    }
    
    @Test
    public void canRollStrike() {
        rollStrikes(1);
        bg.add(3);
        bg.add(3);

        assertEquals(22, bg.getCurrentScore());
    }
    
    @Test
    public void canPlayPerfectGame() {
        rollStrikes(12);

        assertEquals(300, bg.getCurrentScore());
    }
    
    @Test
    public void canRollTwentyAndStrike() {
    	for (int i = 0; i < 19 ; i++){
    		bg.add(2);
    	}
    	bg.add(8);
    	bg.add(10);    	

        assertEquals(56, bg.getCurrentScore());
    }
    
    public void rollSpare(){
    	bg.add(5);
    	bg.add(5);
    }
    
    public void rollStrikes(int nbLance){
    	for (int lance = 0; lance < nbLance; lance ++){
	    	bg.add(10);
        }
    }
}
