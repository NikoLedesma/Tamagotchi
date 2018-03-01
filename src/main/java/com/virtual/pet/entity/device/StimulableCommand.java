package com.virtual.pet.entity.device;

import com.virtual.pet.entity.states.PetState;

public interface StimulableCommand {

    public void giveFoodToPet();

    public void giveDrinkToPet();

    public void giveLoveToPet();

    public void giveFoodToPet(PetState petState);

    public void giveDrinkToPet(PetState petState);

    public void giveLoveToPet(PetState petState);
}
