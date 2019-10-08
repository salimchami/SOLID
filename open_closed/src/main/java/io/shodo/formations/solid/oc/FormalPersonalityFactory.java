package io.shodo.formations.solid.oc;

public class FormalPersonalityFactory implements PersonalityFactory {

    @Override
    public Personality create() {
        return new FormalPersonality();
    }
}
