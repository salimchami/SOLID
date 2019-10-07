package io.shodo.formations.solid.oc.afactory;

public class IntimatePersonalityFactory implements PersonalityAbstractFactory {
    @Override
    public Personality createPersonality() {
        return new IntimatePersonality();
    }
}
