package com.kata.FizzBuzz;

public class FizzBuzz {

	public static String getResult(int i) {
		if (i % 15 == 0) return "fizzbuzz";
		if (i % 5 == 0) return "buzz";
		if (i % 3 == 0) return "fizz";
		
		return String.valueOf(i);
	}

}
