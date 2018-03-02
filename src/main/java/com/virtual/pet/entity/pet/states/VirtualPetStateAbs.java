package com.virtual.pet.entity.pet.states;

import com.virtual.pet.entity.pet.VirtualPet;

abstract class VirtualPetStateAbs implements VirtualPetState {


    static private String DEFAULT_MSG = "Do Nothing....!!!";

    public void eat(VirtualPet virtualPet) {
        //DO NOTHING
        System.out.println(DEFAULT_MSG);
    }

    public void drink(VirtualPet virtualPet) {
        //DO NOTHING
        System.out.println(DEFAULT_MSG);
    }

    public void recvLove(VirtualPet virtualPet) {
        //DO NOTHING
        System.out.println(DEFAULT_MSG);
    }

    void changeState(VirtualPet virtualPet, VirtualPetState virtualPetState) {
        virtualPet.setState(virtualPetState);
    }

}
