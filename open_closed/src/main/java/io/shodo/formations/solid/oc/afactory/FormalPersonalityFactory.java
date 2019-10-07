package io.shodo.formations.solid.oc.afactory;

public class FormalPersonalityFactory implements PersonalityAbstractFactory {
    @Override
    public Personality createPersonality() {
        return new FormalPersonality();
    }
}
