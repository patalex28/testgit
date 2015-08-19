package com.kata.BerlinClock;

public class BerlinClock {

	public String getSeconds(int second) {
		if (second % 2 == 0 ) return "Y";
		return "O";
	}

}
