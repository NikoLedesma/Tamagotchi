package com.virtual.pet.entity.device;

import com.virtual.pet.entity.pet.states.VirtualPetState;

public interface StimulableCommand {

    public void giveFoodToVirtualPet();

    public void giveDrinkToVirtualPet();

    public void giveLoveToVirtualPet();

    public void giveFoodToVirtualPet(VirtualPetState virtualPetState);

    public void giveDrinkToVirtualPet(VirtualPetState virtualPetState);

    public void giveLoveToVirtualPet(VirtualPetState virtualPetState);
}
