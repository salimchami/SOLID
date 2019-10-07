package io.shodo.formations.solid.di;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EmailerTest {
    @Test
    public void testGeneratesAlertString() {
        Emailer emailer = new Emailer();
        assertEquals("It is sunny", emailer.generateWeatherAlert("sunny"));
    }
}
