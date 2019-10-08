package io.shodo.formations.solid.oc;

public class StandardPersonalityFactory implements PersonalityFactory{

    @Override
    public Personality create() {
        return new StandardPersonality();
    }
}
