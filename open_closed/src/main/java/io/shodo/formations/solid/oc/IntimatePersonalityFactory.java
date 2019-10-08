package io.shodo.formations.solid.oc;

public class IntimatePersonalityFactory implements PersonalityFactory {

    @Override
    public Personality create() {
        return new IntimatePersonality();
    }

}
