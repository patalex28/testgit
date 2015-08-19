package com.kata.BerlinClock;

import org.junit.Assert;
import org.junit.Test;

public class testBerlinClock {

	 BerlinClock berlinClock = new BerlinClock();
	 
    // Yellow lamp should blink on/off every two seconds
    @Test
    public void testYellowLampShouldBlinkOnOffEveryTwoSeconds() {
        Assert.assertEquals("Y", berlinClock.getSeconds(0));
        Assert.assertEquals("O", berlinClock.getSeconds(1));
        Assert.assertEquals("Y", berlinClock.getSeconds(2));
        Assert.assertEquals("O", berlinClock.getSeconds(59));
    }
}
