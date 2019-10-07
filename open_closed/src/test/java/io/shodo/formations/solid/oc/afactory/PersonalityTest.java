package io.shodo.formations.solid.oc.afactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalityTest {

    @Test
    void name() {
        Personality casualPersonality = PersonalityFactory.getPersonality(new CasualPersonalityFactory());
        Personality intimatePersonality = PersonalityFactory.getPersonality(new IntimatePersonalityFactory());

        assertEquals("Sup bro?", casualPersonality.greet());
        assertEquals("Hello Darling!", intimatePersonality.greet());
    }
}
