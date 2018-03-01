package com.virtual.pet.entity.states;

import com.virtual.pet.entity.pet.Pet;

public interface PetState {

     void drink(Pet pet);

     void eat(Pet pet);

     void recvLove(Pet pet);

}
