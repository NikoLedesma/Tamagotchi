package com.virtual.pet.entity.pet.states;

import com.virtual.pet.entity.pet.VirtualPet;

public class HappyStateVirtual extends VirtualPetStateAbs {

    public void drink(VirtualPet virtualPet) {
        //DO 5 beeps
        virtualPet.getElectronicDevice().buzzerMakeNBeeps(5);
    }

}
