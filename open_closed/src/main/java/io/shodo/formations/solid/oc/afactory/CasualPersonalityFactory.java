package io.shodo.formations.solid.oc.afactory;

public class CasualPersonalityFactory implements PersonalityAbstractFactory {

    @Override
    public Personality createPersonality() {
        return new CasualPersonality();
    }
}
