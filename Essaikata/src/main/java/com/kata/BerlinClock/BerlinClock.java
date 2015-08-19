package com.kata.BerlinClock;

import java.util.stream.Stream;

public class BerlinClock {

	public String getSeconds(int second) {
		if (second % 2 == 0 ) return "Y";
		return "O";
	}

	public String getTopHours(int hour) {
		/*if (hour >= 20) return "RRRR";
		if (hour >= 15) return "RRRO";
		if (hour >= 10) return "RROO";
		if (hour >= 5) return "ROOO";
		return "OOOO";*/
		return (getOnOff(4, getTopNumberOfOnSigns(hour), "R"));
	}

	public String getBottomHours(int hour) {
		/*int leftHour = hour - (hour/10)*10;
		if (leftHour == 1) return "ROOO";
		if (leftHour == 2) return "RROO";
		if (leftHour == 3) return "RRRO";
		if (leftHour == 4) return "RRRR";
		return "OOOO";*/
		return (getOnOff(4, hour % 5, "R"));
	}

	public String getTopMinutes(int minute) {
		/*if (minute >= 55) return "YYRYYRYYRYY";
		if (minute >= 50) return "YYRYYRYYRYO";
		if (minute >= 50) return "YYRYYRYYRYO";
		return "YYRYYRYYRYY";*/
		return (getOnOff(11, getTopNumberOfOnSigns(minute), "Y").replace("YYY", "YYR"));
	}
	
	private int getTopNumberOfOnSigns(int number) {
	        return (number - (number % 5)) / 5;
	}
	
	 private String getOnOff(int nbLamps, int nbOnSigns, String onSign) {
        String out = "";
        for (int i = 0; i < nbOnSigns; i++) {
            out += onSign;
        }
        for (int i = 0; i < (nbLamps - nbOnSigns); i++) {
            out += "O";
        }
        return out;
    }

	public String getBottomMinutes(int minutes) {
		return (getOnOff(4, minutes % 5, "Y"));
	}

	public String[] convertToBerlinTime(String time) {
		int[] parts = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray();
		String[] berlinTime = new String[5];
		berlinTime[0] = getSeconds(parts[2]);
		berlinTime[1] = getTopHours(parts[0]);
		berlinTime[2] = getBottomHours(parts[0]);
		berlinTime[3] = getTopMinutes(parts[1]);
		berlinTime[4] = getBottomMinutes(parts[1]);

		return berlinTime;
	}

}
