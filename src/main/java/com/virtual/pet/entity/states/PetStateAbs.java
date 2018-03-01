package com.virtual.pet.entity.states;

import com.virtual.pet.entity.pet.Pet;

abstract class PetStateAbs implements PetState {

    void changeState(Pet pet, PetState petState) {
        pet.setState(petState);
    }

    public void eat(Pet pet) {
        //DO NOTHING
    }

    public void drink(Pet pet) {
        //DO NOTHING
    }

    public void recvLove(Pet pet) {
        //DO NOTHING
    }

}
