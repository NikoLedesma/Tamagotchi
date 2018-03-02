package com.virtual.pet.entity.pet.states;

import com.virtual.pet.entity.pet.VirtualPet;

public class SadStateVirtual extends VirtualPetStateAbs {

    public void eat(VirtualPet virtualPet) {
        //Make 2 beeps
        virtualPet.getElectronicDevice().buzzerMakeNBeeps(2);
        // Show pet swallowing(mascota vomitando) in display
        virtualPet.getElectronicDevice().displayShowPetVomiting();
    }

    public void drink(VirtualPet virtualPet) {
        //Make 3 beeps
        virtualPet.getElectronicDevice().buzzerMakeNBeeps(3);
        //Twinkle display
        virtualPet.getElectronicDevice().displayTwinckle();
    }

    public void recvLove(VirtualPet virtualPet) {
        //Change State to happy
        System.out.println("Sad State:Change sad state to happy state");
        this.changeState(virtualPet, new HappyStateVirtual());
    }

}
