package com.virtual.pet.entity.pet.states;

import com.virtual.pet.entity.pet.VirtualPet;

public class ThirstyStateVirtual extends VirtualPetStateAbs {
    public void drink(VirtualPet virtualPet) {
        //Change State to happy
        System.out.println("ThirstyState:Change thirsty state to happy state");
        this.changeState(virtualPet, new HappyStateVirtual());
    }
}
