package com.virtual.pet.entity.pet.states;

import com.virtual.pet.entity.pet.VirtualPet;

public class HungryStateVirtual extends VirtualPetStateAbs {

    public void eat(VirtualPet virtualPet) {
        //Change State to happy
        System.out.println("Change hungry state to happy state.");
        this.changeState(virtualPet,new HappyStateVirtual());
    }

}
