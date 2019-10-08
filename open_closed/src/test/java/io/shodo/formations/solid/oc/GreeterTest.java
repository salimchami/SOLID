package io.shodo.formations.solid.oc;

import org.junit.Test;

import static io.shodo.formations.solid.oc.PersonalityType.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */
public class GreeterTest {
    @Test
    public void testSaysHello() {
        Personality standardPersonality = new StandardPersonalityFactory().create();
        assertEquals("Hello.", standardPersonality.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Personality formalPersonality = new FormalPersonalityFactory().create();
        assertEquals("Good evening, sir.", formalPersonality.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Personality casualPersonality = new CasualPersonalityFactory().create();
        assertEquals("Sup bro?", casualPersonality.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Personality intimatePersonality = new IntimatePersonalityFactory().create();
        assertEquals("Hello Darling!", intimatePersonality.greet());
    }

}
