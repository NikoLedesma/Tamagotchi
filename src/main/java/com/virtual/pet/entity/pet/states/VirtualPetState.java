package com.virtual.pet.entity.pet.states;

import com.virtual.pet.entity.pet.VirtualPet;

public interface VirtualPetState {

     void drink(VirtualPet virtualPet);

     void eat(VirtualPet virtualPet);

     void recvLove(VirtualPet virtualPet);

}
