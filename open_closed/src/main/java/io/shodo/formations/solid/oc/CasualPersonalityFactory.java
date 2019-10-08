package io.shodo.formations.solid.oc;

public class CasualPersonalityFactory implements PersonalityFactory {

    @Override
    public Personality create() {
        return new CasualPersonality();
    }

}
