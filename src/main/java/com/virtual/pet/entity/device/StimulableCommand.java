package com.virtual.pet.entity.device;

import com.virtual.pet.entity.pet.states.VirtualPetState;

public interface StimulableCommand {

    public void giveFoodToPet();

    public void giveDrinkToPet();

    public void giveLoveToPet();

    public void giveFoodToPet(VirtualPetState virtualPetState);

    public void giveDrinkToPet(VirtualPetState virtualPetState);

    public void giveLoveToPet(VirtualPetState virtualPetState);
}
