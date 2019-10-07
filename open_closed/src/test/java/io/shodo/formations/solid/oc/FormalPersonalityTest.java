package io.shodo.formations.solid.oc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormalPersonalityTest {
    @Test
    public void testGreetsSomeoneFormally() {
        Personality fp = new FormalPersonality();
        assertEquals("Good evening, sir.", fp.greet());
    }
}
