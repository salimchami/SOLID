package io.shodo.formations.solid.oc.afactory;

public class PersonalityFactory {
    public static Personality getPersonality(PersonalityAbstractFactory personalityAbstractFactory){
        return personalityAbstractFactory.createPersonality();
    }
}
